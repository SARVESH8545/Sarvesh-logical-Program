package com.java_methodss;

public class Methods_Demo {

	public static void main(String[] args) {
		Methods_Demo md1=new Methods_Demo();
		int x=md1.m1(10, 20);
		System.out.println(x);
		md1.m2(30, 20);
		md1.m3();
		md1.m4();

	}
	//method with parameter & return type 
	int m1(int a,int b) {
		return a+b;
	}

	void m2(int a,int b) {
		System.out.println(a+b);
	}

	void m3() {
		System.out.println("Hello");
	}

	int m4() {
		int a=10,b=30;
		int c=a+b;
		//System.out.println(c);
		return c;
	}



}
