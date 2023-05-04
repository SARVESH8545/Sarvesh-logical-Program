package com.java_string;

public class String_Demo1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));
		String string="sarvesh";
		System.out.println(string.startsWith("sa"));
		System.out.println(string.endsWith("a"));
		String string2="  Pandey  ";
		System.out.println(string2.trim());
		
		String s1="Hi";
		String s3=new String("Hi");
		String s2=s1.intern();
		if (s1==s3) {
			System.out.println("Both are pointing same object");
			}else {
				System.out.println("Not same");
			}
		//System.out.println(s2);
	}

}
