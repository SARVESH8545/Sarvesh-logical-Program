package com.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap_Year {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter year");
		String string=bufferedReader.readLine();
		int year=Integer.parseInt(string);
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");

	}

}
