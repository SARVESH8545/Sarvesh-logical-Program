package com.java_inheritence;

class Parent{
	int id;
	String name;
	public void m1() {
		System.out.println("Parent method m1");
	}
	/*
	 * public Parent(int id, String name) { this.id=id; this.name=name; }
	 */
}
class Child extends Parent{
	public Child(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println(this.id+"  "+this.name);
	}

	public void m2() {
		System.out.println("child method m2");
	}
}
public class InheritenceDemo {

	public static void main(String[] args) {
		Child c=new Child(101,"John");

		//c.m1();
		//c.m2();
		//Parent p=new Parent();
		//p.m1();

	}

}
