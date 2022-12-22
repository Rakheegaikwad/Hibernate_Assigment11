package com.HibernateOneTOMany;

/*
Lab Assignment 11
@Name : Rakhee Gaikwad
@Date : 22 December 2022

Program :-Create one to many relationship one Teacher and their Courses.
A teacher name Mrunali can give multiple courses like Java programming,
python programming, Angular programing but a course is given by one teacher.
*/

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



//declaring a class App
public class App 
{
	//calling main method
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
        Configuration con1=new Configuration().configure().addAnnotatedClass(Courses.class);
        
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tt=session.beginTransaction();
        
        Teacher te=new Teacher();
        te.setT_Id(101);
        te.setT_Name("Mrunali");
       
        Courses cs=new Courses();
        cs.setC_Id(1);
       cs.setC_Name("Java Programming");
       //
       Courses cs1=new Courses();
       cs1.setC_Id(2);
       cs1.setC_Name("Python Programming");
       //
       Courses cs2=new Courses();
       cs2.setC_Id(3);
       cs2.setC_Name("Angular Programming");
       
       List<Courses> cse=new ArrayList<Courses>();
       cse.add(cs);
       cse.add(cs1);
       cse.add(cs2);
       te.setCourses(cse);
       
       session.persist(te);
       session.persist(cse);
      
       tt.commit(); 
   
       session.close();		
       
       
        
    }
    //end of main method
}
//end of class App
