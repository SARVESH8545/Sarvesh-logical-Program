package com.arrayassignement;

/*1. Write a Java program, calculate the average 
value of array elements {28, 38, 50, 19, 20, 60}.*/
public class Question1 {

	public static void main(String[] args) {
		int ar[]= {28,38,50,19,20,60};
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum+=ar[i];
		}
		float avg=(float)sum/ar.length;
		System.out.println("avg :"+avg);

	}

}
