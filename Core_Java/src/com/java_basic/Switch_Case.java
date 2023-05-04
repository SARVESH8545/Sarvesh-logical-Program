package com.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch_Case {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter number for day");
		String string=bufferedReader.readLine();
		int num=Integer.parseInt(string);
		switch (num) {
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tusday");break;
		case 3:System.out.println("Wedsday");break;
		case 4:System.out.println("Thusday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saterday");break;
		case 7:System.out.println("Sunday");break;
		default:System.out.println("Day is not avialable");break;
		}
	}

}
