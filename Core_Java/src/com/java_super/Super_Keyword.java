package com.java_super;

class Parent{
	void m1() {
		System.out.println("Parent class m1( )");
	}
}
class Child extends Parent{
	void m1(){
		super.m1();
		System.out.println("Child class m1( )");
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();

	}

}
