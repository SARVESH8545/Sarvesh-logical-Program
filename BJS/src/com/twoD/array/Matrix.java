package com.twoD.array;

import java.util.Scanner;



public class Matrix {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array row");
	int r=sc.nextInt();
	System.out.println("Enter the array column");
	int c=sc.nextInt();
	int bjs[][]=new int[r][c];
	System.out.println("Enter the array element");
	for (int i = 0; i<r; i++) {
		for (int j = 0; j <c; j++) {
			bjs[i][j]=sc.nextInt();
			}
	
		}
	for (int i = 0; i < bjs.length; i++) {
		for (int j = 0; j < bjs.length; j++) {
			System.out.print(bjs[i][j]+ " ");
		}
		System.out.println();
	}
	}

}
