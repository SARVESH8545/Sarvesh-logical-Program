package com.projectday1;

import java.util.Scanner;

public class SpringSesson {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of months m:");
		int m=sc.nextInt();
		System.out.println("Enter the values of day d:");
		int d=sc.nextInt();
		if((m>=3 && m<=6) && d<=20){
			System.out.println("True ");
		}
		else
		{
			System.out.println("False");
		}
	}
}


