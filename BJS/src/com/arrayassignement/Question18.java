package com.arrayassignement;

/*18. Write a Java program, create 1D array, take a mobile number 
and sort the array with the help of insertion sort.*/
public class Question18 {

	public static void main(String[] args) {
		int mobno[]= {9,1,4,0,1,9,4,7,1,4};
		int temp;
		for (int i = 0; i < mobno.length; i++) {
			for (int j =i+1; j < mobno.length; j++) {
				if (mobno[i]>mobno[j]) {
					temp=mobno[i];
					mobno[i]=mobno[j];
					mobno[j]=temp;
					}
				
			}
			
		}
		for (int i = 0; i < mobno.length; i++) {
			System.out.print(mobno[i]+" ");
		}

	}

}
