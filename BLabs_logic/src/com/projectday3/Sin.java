package com.projectday3;

import java.util.Scanner;

public class Sin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value of x::");
		double x=sc.nextDouble();
		//double pi=3.14;
		x=x%(2*Math.PI);
		double term=1.0;
		double sum=0.0;
		for(int i=0;term!=0.0;i++) {
			term*=(x/i);
			if(i%4==1) 
				sum+=term;
			if(i%4==3)  
				sum-=term;

		}
		System.out.println(sum);

	}
}
