package com.pre;

import java.util.Scanner;

public class Polydrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		int temp=n,rem,rev=0;
		while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
if (rev==n) {
	System.out.println("Polydrome Number");
	
}else {
	System.out.println("Not A Polydrome Number");
}
	}

}
