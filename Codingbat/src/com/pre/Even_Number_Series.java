package com.pre;

import java.util.Scanner;

public class Even_Number_Series {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a  Number");
		int n=scanner.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.print(" "+((2*i)-1));
		}
//		int i=1;
//		while (i<=n) {
//			System.out.println(""+(2*i-1));
//			i++;
//			
//		}



		}
	}


