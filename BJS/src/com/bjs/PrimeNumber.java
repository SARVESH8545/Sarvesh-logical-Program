package com.bjs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner= new Scanner(System.in);
		System.out.println("Eneter a number");
		int n=scanner.nextInt();
		int count=0;
		for (int i =1; i<=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime Number");
		}else {
			System.out.println("Not a prime Number");
		}
	}

}
