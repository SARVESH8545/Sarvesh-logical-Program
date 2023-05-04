package com.accessmodifires;

class Test{
	protected int a=10;
	protected  void m1() {
		System.out.println(a);
	}
}

public class ProtectedMofifire {

	public static void main(String[] args) {
		Test test=new Test();
		test.a=20;
		test.m1();
	}

}
