package com.oops;

public class Parent {
	//Overrrdin method
	public void m1() {
		System.out.println("m1() from parent");

	}
}
	class Child extends Parent{
		//Overrriding
		public void m1() {
			System.out.println("m1() from child");

		}

	}


