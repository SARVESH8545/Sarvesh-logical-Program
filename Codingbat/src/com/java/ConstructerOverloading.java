package com.java;

public class ConstructerOverloading {

	ConstructerOverloading( int a, int b){
		System.out.println("1//"+(a+b));
	}

	ConstructerOverloading( int a, int b,int c){
		System.out.println("2//"+(a+b+c));
	}
	ConstructerOverloading( int a, float b){
		System.out.println("3//"+(a+b));
	}
	ConstructerOverloading( int a, double b){
		System.out.println("4//"+(a+b));
	}

	public static void main(String[] args) {
ConstructerOverloading co=new ConstructerOverloading(20, 10);

ConstructerOverloading c1=new ConstructerOverloading(20, 10,30);
ConstructerOverloading c2=new ConstructerOverloading(20, 10.0f);

ConstructerOverloading c3=new ConstructerOverloading(20, 10.0d);

	}

}
