package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
//		int a[]= {38,52,9,6,18,62,36};
//		int min,temp=0;
//		for (int i = 0; i < a.length; i++) { // 0<7
//			min=i;                           //0
//			for (int j =i+1; j < a.length; j++) { //1<7
//				if (a[j]<a[min]) {               //52<38  52<9
//					min=j;
//				}
//			}
//			temp=a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+ " ");
//		}
		
		String []a= {"Apple","Sarvesh","Pandey","Boys","Ece"};
		int min;
		String temp="";
		for (int i = 0; i < a.length; i++) {
			min=i;                           
			for (int j =i+1; j < a.length; j++) { 
				if (a[j].compareTo(a[min])<0) {              
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
