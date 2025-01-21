package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//for table name change
//@Table(name = "mystudents")
public class Student {
	
    @Id
	private int id;
	private String name;
	private String city;
	
	//constructor using filed
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//constructor using supper
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//geter and seter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//override to string method for print
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.city ;
	}
	
	
	
	
	
}
