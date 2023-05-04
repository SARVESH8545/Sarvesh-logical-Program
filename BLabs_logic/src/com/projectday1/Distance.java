package com.projectday1;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the value of y");
		System.out.println();
		int y=sc.nextInt();
		double d=Math.sqrt(x*x+y*y);
		System.out.println("Distance from("+x+","+y+")to (0,0)="+d);
	}

}
