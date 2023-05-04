package com.java;

interface A{
	int a=10;
	
	void m1(); 
}
public class Test implements A {
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
//		Test t=new Test();
//		t.m1();

		A a=new Test();
		a.m1();
		}

}
