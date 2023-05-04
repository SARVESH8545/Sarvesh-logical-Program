package com.projectday3;

import java.util.Scanner;

public class SecondLargest_smallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements you wait in array(min)2");
		int n,temp;
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all Elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;i<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("Second Largest:"+a[n-2]);
			System.out.println("second Smallest:"+a[0]);
		}
		
	}

}
