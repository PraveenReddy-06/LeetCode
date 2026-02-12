package com.klu.model;

public class Student {

	private int id;
	private String name;
	private String course;
	
	public Student() {}
	
	public Student(int i,String n,String c) {
		this.name=n;
		this.id=i;
		this.course=c;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setCourse(String c) {
		this.course=c;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getCourse() {
		return this.course;
	}
	
	
}
