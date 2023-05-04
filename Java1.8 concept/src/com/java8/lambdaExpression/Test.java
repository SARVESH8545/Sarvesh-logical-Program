package com.java8.lambdaExpression;

@FunctionalInterface
interface Cab{
	public void bookCab();
}
//class Ola implements Cab{
//	public void bookCab() {
//		System.out.println("Ola cab is booked");
//	}
//}

public class Test {

	public static void main(String[] args) {
		//Ola ola=new Ola();
		//Cab ola=new Ola();
		Cab cab=()->System.out.println("Ola cab is booked");
		cab.bookCab();

	}

}
