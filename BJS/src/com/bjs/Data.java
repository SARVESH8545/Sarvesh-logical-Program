package com.bjs;

public class Data {
        
	public static void conditional(int a,int b) {
    	  String c=(a>b)?"A is grater":"B is grater";
    	  System.out.println(c);
		}
	public static void bitwise(int a,int b) {
		int c=a&b;
		System.out.println(c);
		}
	public static void relational(int a,int b) {
		boolean c=a==b;
		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
	//Data data=new Data();
	int m=10,n=5;
	conditional(m, n);
	bitwise(m, n);
	relational(m, n);
	
	}
	

}
