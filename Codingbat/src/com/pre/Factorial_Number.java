package com.pre;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		int fact=1;
		for (int i = 1; i<=n; i++) {
			fact=fact*i;
			}
		System.out.println("Factorial Number="+fact);

	}

}
