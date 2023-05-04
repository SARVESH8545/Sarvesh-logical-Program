package com.bjs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int temp=number;
		int rev=0,rem;
		while(temp>0) {
			 rem=temp%10;
			 rev=rev*10+rem;
			 temp=temp/10;
			}
	       if (number==rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome number");
		}

	}

}
