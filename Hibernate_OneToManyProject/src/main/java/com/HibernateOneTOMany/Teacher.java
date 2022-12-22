package com.HibernateOneTOMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Teachers")
public class Teacher 
{
	@Id
	private int t_Id;
	private String t_Name;
	@OneToMany(cascade=CascadeType.ALL)
	List<Courses> courses;
	
	public Teacher() 
	{
		
	}

	public int getT_Id() {
		return t_Id;
	}

	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}

	public String getT_Name() {
		return t_Name;
	}

	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
	
	

}
