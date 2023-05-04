package com.java_polymorphism_overloading;

class Sum{
	public static int Add(int i,int j){
		return i+j;
	}
	public static int Add(int i,int j,int k){

		return i+j+k;
	}
}
public class Calculation {

	public static void main(String[] args) {
		int sum1=Sum.Add(10, 30);
		int sum2=Sum.Add(10, 30, 20);
		System.out.println("Sum1 :"+sum1);
		System.out.println("Sum2 :"+sum2);
	}

} 
