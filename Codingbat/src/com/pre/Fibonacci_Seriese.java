package com.pre;

import java.util.Scanner;

public class Fibonacci_Seriese {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scanner.nextInt();
		int n1=0,n2=1,n3;
		System.out.print("fibonacci series="+n1+","+n2);
		for (int i = 0; i <n; i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;

		}
	}

}
