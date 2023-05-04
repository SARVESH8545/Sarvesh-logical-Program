package com.java;

class Animal{
	String color="White";
}
class Dog extends Animal{
	String color="Black";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.printColor();
		
		
	}

}
