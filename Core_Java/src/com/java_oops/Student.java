package com.java_oops;

public class Student {
	public static void main(String[] args) {
		System.out.println("Main method");
		Student s1=new Student();
		Student.greet();
		s1.hello();

	}
	void hello() {
		System.out.println("Hello method");
	}
	static void greet() {
		System.out.println("static method");
	}
}
