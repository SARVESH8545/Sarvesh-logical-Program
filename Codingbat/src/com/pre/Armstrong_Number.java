package com.pre;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		int rem,temp=n,sum=0;
		while (temp>0) {
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
			}
		if (sum==n) {
			System.out.println("Armstrong Number");
			
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
