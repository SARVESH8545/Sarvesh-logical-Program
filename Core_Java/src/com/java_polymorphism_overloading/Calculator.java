package com.java_polymorphism_overloading;

class Adder{
	public void add(int a, int b) {
		System.out.println("1st Addition is :"+(a+b));
	}
	public void add(int a ,int b, int c) {
		System.out.println("2nd Addition is :"+(a+b+c));

	}
}
public class Calculator {

	public static void main(String[] args) {
		Adder add=new Adder();
		add.add(10, 20);
		add.add(10, 20, 30);


	}

}
