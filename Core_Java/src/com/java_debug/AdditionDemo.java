package com.java_debug;

public class AdditionDemo {

	public int  sum(int i, int j) {
		return i+j;
		
		
	}
	public static void main(String[] args) {
	AdditionDemo additionDemo=new AdditionDemo();
	int sum = additionDemo.sum(10, 20);
	System.out.println(sum);
	}

}
