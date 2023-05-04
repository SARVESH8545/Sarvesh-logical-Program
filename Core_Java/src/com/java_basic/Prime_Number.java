package com.java_basic;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		int count=0;
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				count++;
			}
			
		} 
		if (count==2) {
			System.out.println("Prime Number");
			
		}else {
			System.out.println("Not a Prime Number");
		}
	}

}
