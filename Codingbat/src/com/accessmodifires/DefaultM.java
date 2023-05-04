package com.accessmodifires;

 class Aa{
	int a=10;
	void m1(){
		System.out.println(a);
	}
	
}
public class DefaultM {

	public static void main(String[] args) {
		Aa aobj=new Aa();
		aobj.a=20;
		aobj.m1();

	}

}
