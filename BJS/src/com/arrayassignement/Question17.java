package com.arrayassignement;

import java.util.Scanner;

/*17. Write a Java program, create one application.
Name of the application is Thermometer.
Convert from Fahrenheit to Celsius. c=(f-32)*5/9  */



public class Question17 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter temp in Fahrenheit:");
		float f=scanner.nextFloat();
		double c=((f-32)*5/9);
		System.out.println("Temp in Celsius:"+c);


	}

}
