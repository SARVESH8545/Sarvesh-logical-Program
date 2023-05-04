package com.arrayassignement;

/*10. Write a Java program, create 1D array {10, 20, 30, 60}. 
a] Find out difference between the maximum and the minimum element.
b] Check if that particular difference value is available in the array or not. */
public class Question10 {

	public static void main(String[] args) {
	int ar[]= {10,20,30,60};
	int max=ar[0];
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]>max) {
			max=ar[i];
		}
		
	}
	System.out.println("Max value :"+max);
	
	int min=ar[0];
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]<min) {
			max=ar[i];
		}
		
	}
	System.out.println("Min value :"+min);
	
	int diff=max-min;
	System.out.println("Difference :"+diff);
	
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]==diff) {
			System.out.println("Value is there");
		
			}else {
				System.out.println("Value is not there");
				break;
			}
		
	}

}

}
