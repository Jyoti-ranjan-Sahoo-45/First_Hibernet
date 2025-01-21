package com.tut;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("enter id=");
    	int sid=sc.nextInt();
    	
    	
    	System.out.print("enter name=");
    	String sname=sc.next();
    	
    	System.out.print("enter city=");
    	String scity=sc.next();
    	  	
        System.out.println( "project started..." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
      //creating student
        Student st=new Student();
        st.setId(sid);
        st.setName(sname);
        st.setCity(scity);
        
        System.out.println(st);
        
      Session session=  factory.openSession();
        
     Transaction tx=session.beginTransaction();
      session.save(st);
      tx.commit();
      
      
        
        session.close();
        
        
    }
}
