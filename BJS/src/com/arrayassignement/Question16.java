package com.arrayassignement;

import java.util.Scanner;

//16. Write a Java program, find out area of solid sphere.

public class Question16 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Radius of sphere :");
		float r=scanner.nextFloat();
		double area=(4*(Math.PI)*r*r);
		System.out.println("Area :"+area);
		

	}

}
