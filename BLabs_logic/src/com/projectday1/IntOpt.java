package com.projectday1;
import java.util.Scanner;
class IntOpt 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value a:");
		int a=s.nextInt();
		System.out.println("Enter the Value b:");
		int b=s.nextInt();
		System.out.println("Enter the Value c:");
		int c=s.nextInt();
		System.out.println("a+b*c="+(a+b*c));
		
	System.out.println("a*b+c="+(a*b+c));

	System.out.println("c+a/b="+(c+(a/b)));
		
	System.out.println("a+b*c="+((a%b)+c));
			

	}
}
