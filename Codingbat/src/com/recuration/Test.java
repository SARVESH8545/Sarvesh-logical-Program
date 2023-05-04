package com.recuration;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  a number");
		int n=scanner.nextInt();
		int count=0;
		for (int i = 1; i<=n; i++) {
			if (n%i==0) {
				count++;
				}
			}
			if (count==2) {
				System.out.println("Prime Number");
				}
			else {
				System.out.println("Not a Prime Number");
			}
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int year=scanner.nextInt();
//		if ((year%4==0 && year%100!=0)||(year%400==0 )){
//			System.out.println("Leap year");
//			}
//		else {
//			System.out.println("Not leap year or ordenary year");
//		}

	}

}
