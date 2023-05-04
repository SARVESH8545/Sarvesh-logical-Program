package com.java_methodss;

import java.util.Scanner;

class Person1{
	int id;
	String name;
	int age;

}
public class Driver3 {

	Person1 getData(int id) {
		Person1 p=new Person1();
		if (id==101) {
			p.id=101;
			p.name="Raju";
			p.age=30;

		}else if (id==102) {
			p.id=102;
			p.name="Rani";
			p.age=32;
		}
		return p;
	}

	public static void main(String[] args) {
		Driver3 d3=new Driver3();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ids: ");
		int id=scanner.nextInt();
		Person1 p1=d3.getData(id);
		System.out.println(p1.id+" "+p1.name+" "+p1.age);

	}

}
