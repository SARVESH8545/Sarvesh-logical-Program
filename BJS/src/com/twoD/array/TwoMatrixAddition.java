package com.twoD.array;

import java.util.Scanner;

public class TwoMatrixAddition {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array row size");
		int row=scanner.nextInt();
		System.out.println("Enter the array column size");
		int col=scanner.nextInt();
		System.out.println("Enter First array Element");
		int array1[][]=new int[row][col];
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				 array1[i][j]=scanner.nextInt();
		}
		}
		
		System.out.println("Enter Second array Element");
		int array2[][]=new int[row][col];
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				 array2[i][j]=scanner.nextInt();
		}
		}
		
		System.out.println("Addition of two Array");
		int array3[][]=new int[row][col];
		for (int i= 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				array3[i][j]=array1[i][j]+array2[i][j];
				}
			
		}
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
			System.out.print(array3[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
