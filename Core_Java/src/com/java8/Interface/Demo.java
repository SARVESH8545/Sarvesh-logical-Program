package com.java8.Interface;

interface demo1{
	public void add();
	public default void Subject() {
		System.out.println("Sub method call");
	}
	public static void name() {
		System.out.println("Static method call");
		
	}
}



public class Demo implements demo1 {

	public static void main(String[] args) {
		demo1 d1=new Demo();
		d1.add();
		d1.Subject();
		demo1.name();
		
		
	}

	@Override
	public void add() {
		System.out.println("Add method called");
		
	}

}
