package com.java;

public class MethodOverLoading {
   void add(int a,int b){
	   System.out.println("1//"+(a+b));
   }
 void add(int a,int b,int c){
	 System.out.println("2//"+(a+b+c));
	   
   }
 void add(int a,double b){
	 System.out.println("3//"+(a+b));
	   
 }
 void add(int a,float b){
	 System.out.println("4//"+(a+b));
	   
 }
	public static void main(String[] args) {
		MethodOverLoading methodOverLoading=new MethodOverLoading();
		methodOverLoading.add(10, 20);
		methodOverLoading.add(10, 20, 30);
		methodOverLoading.add(10, 10.0f);
		methodOverLoading.add(50, 50.20d);

	}

}
