package com.bjs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		// by using if else condition
//		if((year%4==0 && year%100!=0)||(year%400==0)){
//			System.out.println("Leapyear");
//			
//		}else {
//			System.out.println("Common year");
//		}
		
			// by using ternary condtion
		String msg=((year%4==0 && year%100!=0)||(year%400==0))?"Leap Year":"Common year";
		System.out.println(msg);
				
	
	}

}
