package com.arrayassignement;
/*13. Write a Java program, create 1D array.
Store your 7th semester marks and find out the fourth maximum marks.*/

public class Question13 {

	public static void main(String[] args) {
		int arr[]= {50,80,70,90,40,};
		for (int i = 0; i < arr.length; i++) {
		for (int j =i+1; j < arr.length; j++) {
			int tmp = 0;  
			if (arr[i] > arr[j])   
			{  
			tmp = arr[i];  
			arr[i] = arr[j];  
			arr[j] = tmp;  
			}
			}
		System.out.print("  "+arr[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("4th max marks :"+arr[arr.length-4]);
			break;
			
		}

	}
	}
