package com.twoD.array;

import java.util.Scanner;

public class IdenticalMatrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array :" );
		int n=scanner.nextInt();
	for (int i = 0; i <n; i++) {
		for (int j = 0; j <n; j++) {
			if (i==j) {
				System.out.print("1"+" ");
				
			}else {
				System.out.print("0"+" ");
			}
			
		}
		System.out.println();
	}

	}

}
