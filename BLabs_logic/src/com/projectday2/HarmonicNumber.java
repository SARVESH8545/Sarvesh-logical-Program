package com.projectday2;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of serices::");
		int num=sc.nextInt();
		double result=0.0;
		while (num>0) {
			result=result+(double)1/num;
			num--;
		}
		System.out.println("output::"+result);
	}

}
