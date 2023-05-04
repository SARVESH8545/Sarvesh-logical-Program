package com.pre;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a 1st Number");
		int a=scanner.nextInt();
		System.out.println("Enter a 2nd Number");
		int b=scanner.nextInt();
		//type5
		a=a^b;//10*20=200
		b=a^b;//200/10=20
		a=a^b;//200/20=10
		//type4
//		a=a*b;//10*20=200
//		b=a/b;//200/10=20
//		a=a/b;//200/20=10
		//type3
//		a=a+b;//10+20=30
//		b=a-b;//30-10=20
//		a=a-b;//30-20=10
		
		//type2
		//b=a+(a=b)-b;
		// type1 
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
		System.out.println("a value="+a);
		System.out.println("b value="+b);
	}

}
