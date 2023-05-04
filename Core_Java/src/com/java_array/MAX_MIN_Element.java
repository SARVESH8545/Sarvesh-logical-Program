package com.java_array;
//Write a program print Max and min Element of Array?
public class MAX_MIN_Element {

	public static void main(String[] args) {
		int arr[]= {15,8,9,2,11,4};
		//type2
		int max=arr[0];
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]>max) {
			max=arr[i];
			}
		if (arr[i]<min) {
			min=arr[i];
			
		}
		}
		System.out.println("Max_Element: "+max+" Min_Element: "+min);
 //type 1
		//Arrays.sort(arr);
		//System.out.println("Min Element: "+arr[0]+" Max Element: "+arr[(arr.length-1)]);
	}

}
