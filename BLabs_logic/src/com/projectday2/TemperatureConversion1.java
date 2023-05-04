package com.projectday2;

import java.util.Scanner;

public class TemperatureConversion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in fahrenheit:");
		double f=sc.nextDouble();
		double c=((f-32)*5)/9;
		System.out.println(" Fahrenheit to Celsias :"+c);
	}

}
