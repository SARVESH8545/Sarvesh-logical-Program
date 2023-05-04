package com.java8.Interface;

interface Vehicle{
	public void start();
	public default void clean() {
		System.out.println("Cleaning car");
	}
	public static void display() {
	System.out.println("Display on Road");	
	}
	
}

public class Car implements Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.clean();
		car.start();
		Vehicle.display();

	}

	@Override
	public void start() {
		System.out.println("Car started");
		
	}

}
