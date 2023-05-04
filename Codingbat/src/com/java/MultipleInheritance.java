package com.java;

interface abc{
	int x=10;
	void m1();
}

interface xyz{
	int y=200;
	void m2();
}
interface mno{
	int z=300;
	void m1();
}
public class MultipleInheritance implements abc,xyz,mno {
	public void m1() {
		System.out.println(x);
	}

	public void m2() {
		System.out.println(y);
	}
	public void m3() {
		System.out.println(z);
	}

	public static void main(String[] args) {
		MultipleInheritance multipleInheritance=new MultipleInheritance();
		multipleInheritance.m1();
		multipleInheritance.m2();
		multipleInheritance.m3();
	}

}
