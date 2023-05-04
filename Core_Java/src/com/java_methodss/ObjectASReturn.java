package com.java_methodss;

class Person{
	int id;
	String name;
	int age;	
}
public class ObjectASReturn {

	Person getData() {
		Person p=new Person();
		p.id=101;
		p.name="Sarvesh";
		p.age=25;
		return p;
	}

	public static void main(String[] args) {
		ObjectASReturn o1=new ObjectASReturn();
		Person p=o1.getData();
		System.out.println(p.id+"  "+p.age+"   "+p.name);



	}

}
