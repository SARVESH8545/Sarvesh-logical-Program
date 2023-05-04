package com.java_methodss;


class Employee{
	int id;
	String name;
}
public class Driver1 {

	void print(Employee e) {
		System.out.println(e.id+" "+e.name);
	}

	public static void main(String[] args) {
		Driver1 d1=new Driver1();
		Employee e1=new Employee();
		e1.id=102;
		e1.name="sarvesh";
		d1.print(e1);


	}

}
