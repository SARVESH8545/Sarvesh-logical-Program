package com.java;

public class StaticExaple {
	static int a=10;
	int b=20;
	
	static void  m1() {
		System.out.println("Static m1()");
	}
	
		void m2() {
		System.out.println("NON-Static m2()");
	}
	
	void m3() {
		
		System.out.println("Non Static M3()");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		System.out.println(StaticExaple.a);
		StaticExaple.m1();
		
		StaticExaple s=new StaticExaple();
		System.out.println(s.b);
		s.m2();
		
		s.m3();
	}

}
