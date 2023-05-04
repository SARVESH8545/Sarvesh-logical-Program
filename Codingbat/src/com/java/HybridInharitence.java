package com.java;

class A1{
	void m1() {
		System.out.println("This is m1() from A1 Class");
	}
}
interface I1{
	void m2();
		}
interface I2{
	void m3();
		}

public class HybridInharitence extends A1 implements I1,I2 {
	public void m2() {
		System.out.println("This is m2() from I1");
	}
	public void m3() {
		System.out.println("This is m2() from I1");
	}
	public static void main(String[] args) {
		HybridInharitence mInharitence=new HybridInharitence();
		mInharitence.m1();
		mInharitence.m2();
		mInharitence.m3();

	}

}
