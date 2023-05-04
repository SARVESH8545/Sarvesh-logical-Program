package com.exception;

public class  UncheckedExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		int a=100;
		try {
			System.out.println(a/0); //  Throw Arithmetic Exception 
		} catch (ArithmeticException e) {
			System.out.println("Enter in the catch block");
		}
		
		//String string=null;
		//System.out.println(string.length()); // Throw Null pointer Exception
		
		//String s="abc";
		//int i=Integer.parseInt(s); // throw numberformat exception
		  
//		int a[]=new int[5];
//		a[10]=100;
//		System.out.println(a[10]); // throw java.lang.ArrayIndexOutOfBoundsException:
		
		
		System.out.println("program is completed ");
		System.out.println("Program is exit");

	}

}
