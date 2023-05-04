package com.pre;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		if (n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("ODD Number");
		}

	}

}
