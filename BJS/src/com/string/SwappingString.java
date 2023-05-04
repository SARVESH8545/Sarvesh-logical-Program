package com.string;
//Swap String
public class SwappingString {

	public static void main(String[] args) {
		String s1="Sarvesh";
		String s2="Pandey";
		System.out.println("Before Swapping :"+s1);
		System.out.println("Before Swapping :"+s2);
		System.out.println();
		String temp;
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping :"+s1);
		System.out.println("After swapping :"+s2);
		

	}

}
