package com.projectday2;

import java.util.Scanner;

public class TemperatureConversion{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in Celsias:");
		double c=sc.nextDouble();
		double f=((c*5)/9)+32;
		System.out.println("Celsias to Fahrenheit:"+f);

	}
}
