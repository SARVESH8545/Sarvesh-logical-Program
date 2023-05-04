package com.java_constrocter;

public class Employee {
	int id;
	String name;


	Employee() {
		System.out.println("Default Constructor");
	}
	Employee(int id){//parameter constructor
		System.out.println(id);

	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
		System.out.println(this.id+" "+this.name);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee(101);
		Employee emp2=new Employee(102,"Sarvesh");

	}

}
