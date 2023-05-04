package com.bjs;

import java.util.Scanner;

public class Semester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		System.out.println("Enter fourth number");
		int d=sc.nextInt();
		int total=a+b+c+d;
		float average=total/4;
		double percentage=(total/400)*100;
		System.out.println("Average Marks is :"+average);
		System.out.println("percentage is "+percentage);
	}

}
