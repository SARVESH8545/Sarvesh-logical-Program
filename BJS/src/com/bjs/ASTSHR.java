package com.bjs;

import java.util.Scanner;

public class ASTSHR {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter AS marks :");
		int as=scanner.nextInt();
		System.out.println("enter Ts marks :");
		int ts=scanner.nextInt();
		System.out.println("enter hr marks :" );
		int hr=scanner.nextInt();
		double permarks=(as+ts+hr)/3;
		System.out.println("Permarks is:"+permarks+"%");
		if(permarks%2==0 && permarks%4==0) {
			System.out.println("print x-oR logic");
			int x=25,y=15;
			System.out.println("X^Y="+(x^y));
		}
		if(permarks%2!=0 || permarks%4!=0) {
			System.out.println("Print OR-Logic");
			int x=25,y=15;
			System.out.println("X|y="+(x|y));
			
		}
	}

}
