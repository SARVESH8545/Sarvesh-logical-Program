package com.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If_Else {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter your Age");
		String s=br.readLine();

		int age=Integer.parseInt(s);

		//		int age=20;
		if(age>=18) {
			System.out.println("Eligible for Vote");
		}else {
			System.out.println("Not Eligible for vote");
		}

	}

}
