package com.bjs;

import java.util.Scanner;

public class IFELSEByArea {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value a: ");
		int a=scanner.nextInt();
		System.out.println("Enter value b:");
		int b=scanner.nextInt();
		System.out.println("Enter value c:");
		int c=scanner.nextInt();
		int d=a+b+c;
		System.out.println("Value of d is :"+d);
		if(d%2==0) {
			System.out.println("Print ara of parabola:");
			int base=10,altitude=15;
			double area=(base*altitude)/3;
			System.out.println(area);
		}
		else {
			System.out.println("print area of cone:");
			int r=10,h=15;
			double area=(Math.PI)*r*(r+(Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2))));
			System.out.println(area);

		}
	}

}
