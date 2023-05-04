package com.arrayassignement;
/*11. Write a Java program, find out combinations of four elements of 
the given array whose sum is equal to the given value.
Given array: {20, 90, 1, 7, 40, 60}
Value: 121*/


public class Question11 {

	public static void main(String[] args) {
		int a[]= {20, 90, 1, 7, 40, 60};
		int val=121;
		
		for (int i = 0; i < a.length-3; i++) {
			for (int j =i+1; j < a.length-2; j++) {
				for (int j2 =j+1; j2 < a.length-1; j2++) {
					for (int k =j2+1; k < a.length; k++) {
						if (a[i]+a[j]+a[j2]+a[k]==121) {
						System.out.println(a[i]+" "+a[j]+" "+a[j2]+" "+a[k]);	
						}
					}
					
				}
				
			}
			
		}
		
	}

}
