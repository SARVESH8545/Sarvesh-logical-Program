package com.oops;

public class Student {
	int studentId;
	String studentName;
	String studentCity;
	
	public void show() {
		System.out.println(studentName+"is studing");
		
	}
	public void name() {
		System.out.println("Student Id is"+studentId+"Name is "+studentName+"City is"+studentCity);
		
	}
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int i, String n,String c) {
		System.out.println("Parametries Constructor");
		studentId=i;
		studentName=n;
		studentCity=c;
		System.out.println(studentId+""+studentName+""+studentCity);
	}

}
