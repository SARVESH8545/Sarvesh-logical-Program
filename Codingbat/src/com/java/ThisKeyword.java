package com.java;

public class ThisKeyword {
	int a=10;
	int b=20;
	void getValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	void printValue() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
      ThisKeyword t=new ThisKeyword();
      t.getValue(10,20);
      t.printValue();
      
	}

}
