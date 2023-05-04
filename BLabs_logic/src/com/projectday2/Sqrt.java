package com.projectday2;

import java.util.Scanner;

public class Sqrt { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of c:");
		double c = sc.nextDouble();
		double epsilon = 1.0e-15;  // relative error tolerance
		double t = c;              // estimate of the square root of c


		while (Math.abs(t - c/t) > epsilon*t) {
			t = (c/t + t) / 2.0;
		}

		// print out the estimate of the square root of c
		System.out.println( "The value of t:"+t);
	}

}