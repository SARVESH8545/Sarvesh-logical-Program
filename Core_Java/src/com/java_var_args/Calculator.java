package com.java_var_args;

public class Calculator {
	
	public void add(int...a) {
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		System.out.println("Sum :"+sum);
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10,20);
		cal.add(10,20,30);
		cal.add(10,20,30,40);
 
	}

}
