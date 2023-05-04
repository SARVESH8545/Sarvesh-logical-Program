package com.java_string;

import java.util.Arrays;

public class String_PredefinedMethod {

	public static void main(String[] args) {
		
		//split
		String s1="Hi@Hello@Sarvesh";
		String arr[]=s1.split("@");
		System.out.println(Arrays.toString(arr));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		
		
//		String str="sarvesh";
//		String s2="pandey";
//		String s3=str.concat(s2);
//		System.out.println(s3);
		
		//String s2=str.substring(0,4);
		//System.out.println(s2);
		//System.out.println(str.indexOf('s'));
		//System.out.println(str.lastIndexOf('s'));
		//System.out.println(str.replace('v', 'V'));
		
		//System.out.println(str.length());
		//System.out.println(str.charAt(0));
		

	}

}
