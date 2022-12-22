package com.HibernateOneTOMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="NewCouses")
public class Courses 
{
	@Id
	private int c_Id;
	private String  c_Name;
	
	public Courses() {
		
		
	}
	public int getC_Id() {
		return c_Id;
	}
	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
	
	
	
	
	
	
	
}
