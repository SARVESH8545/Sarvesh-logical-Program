package com.projectday2;

import java.util.Scanner;

public class Poweroftow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs::");
		int n=sc.nextInt();
		int i=0;
		int power=1;
		while(i<=n) {
			System.out.println(i+""+power);
			power=2*power;
			i=i+1;
		}


	}

}
