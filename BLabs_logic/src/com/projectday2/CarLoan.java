package com.projectday2;

import java.util.Scanner;

public class CarLoan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the p:");
		double p=sc.nextDouble();
		System.out.println("Enter the y:");
		double y=sc.nextDouble();
		System.out.println("Enter the r:");
		double r=sc.nextDouble();
		r=(r/100)/12;
		double n=12*y;
		double payment=(p*r)/(1-Math.pow(1+r, -n));
		double intrest=payment*n-p;
		System.out.println("Monthly payment="+payment);
		System.out.println("Total intrest="+intrest);
	}

}
