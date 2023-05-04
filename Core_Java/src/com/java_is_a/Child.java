package com.java_is_a;
class Parent{
	void m1() {
		System.out.println("Parent method m1() Called");
	}
}
public class Child extends Parent {
	void m1() {
		System.out.println("Child method m1() called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.m1();

	}

}
