package com.accessmodifires;

class A{
	private int a=10;
	private  void name() {}
}
public class PrivateM {

	public static void main(String[] args) {
		A objA=new A();
		//objA.a=20;//compile time error
		//objA.name();//compile time error

	}

}
