package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
	int a[]= {10,20,5,45,3,50,};
	for (int i = 0; i < a.length; i++) {  // i=0;i<6;
		for (int j = 0; j < a.length; j++) {// j=0;j<6;
			if(a[i]<a[j]) {  // 10<10
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("printing sorting Array:");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	}
}
