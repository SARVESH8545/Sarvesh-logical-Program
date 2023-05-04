package com.projectday3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Prime no between 1 to n:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			boolean prime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				System.out.print(i+" ");
			}
		}
	}

}
