package com.pre;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a 1st Number");
		int n=scanner.nextInt();
		System.out.println("Enter a 2nd Number");
		int m=scanner.nextInt();
		int hcf=0;
		for (int i = 1; i <=m; i++) {
			if (m%i==0 && n%i==0) {
				hcf=i;
				
			}
			
		}
		System.out.println("HCF="+hcf);

	}

}
