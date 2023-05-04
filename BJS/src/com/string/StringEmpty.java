package com.string;
// how to check string is empty or Not
public class StringEmpty {

	public static void main(String[] args) {
		//String s="Sarvesh";
		//String s=" ";
		//String s=null; // nullPointerException
		String s="";
		if (s.length()==0) {
			System.out.println("Empty String");
			
		}else {
			System.out.println("Not Empty String");
		}
	}

}
