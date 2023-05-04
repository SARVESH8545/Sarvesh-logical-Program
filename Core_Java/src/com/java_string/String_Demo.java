package com.java_string;

public class String_Demo {

	public static void main(String[] args) {
		String str1="Hi";
		String str2="Hi";
		String str3=new String("Hi");
		String str4=new String("Hi");
//		if (str1==str2) {
//			System.out.println("Same");	//output:- Same		
//		}else{
//			System.out.println("Not Same");
//		}
		if (str1.equals(str4)) {
			System.out.println("Same");
			}else {
				System.out.println("Not Same");
			}

	}

}
