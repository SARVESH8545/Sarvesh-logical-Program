package com.java_basic;

import java.io.*;

public class If_Else_Ladder {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a number");
		String str=br.readLine();
		int number=Integer.parseInt(str);
		if (number>0) {
			System.out.println("Number is postive");
		}else if (number<0) {
			System.out.println("Nigative Number");

		}else {
			System.out.println("Number is Zero");
		}


	}

}
