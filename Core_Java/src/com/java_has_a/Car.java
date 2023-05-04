package com.java_has_a;

public class Car {
	void drive() {
		Engine e= new Engine();
		e.start();
		System.out.println("drive care");
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.drive();
	}

}
