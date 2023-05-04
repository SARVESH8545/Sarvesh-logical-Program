package com.pre;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		int count=0;
		for (int i = 1; i<=n; i++) {
			if (n%i==0) {
				count++;
				}
			
		}
		if (count==2) {
			System.out.println("Prime Number");
			
		}else {
			System.out.println("Not a prime Number");
		}

	}

}
