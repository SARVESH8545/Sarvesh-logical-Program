package com.bjs;

import java.util.Scanner;

public class FabbonicSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter range");
		int n1=0,n2=1,n3;
		int range=scanner.nextInt();
		System.out.print(" "+n1+" "+n2);
		for (int i = 0; i<=range; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
	}

}
