package com.pre;

import java.util.Scanner;

public class Odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		if (n%2==1) {
			System.out.println("Odd Number");
		}else {
			System.out.println("Even number");
		}

	}

}
