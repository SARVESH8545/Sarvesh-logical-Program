package com.bjs;

public class MathOp {
	
	public void show() {
		String string="Java is a programming language and plateform";
		System.out.println(string);
		}
	public void swap() {
		int a=10,b=20;
		b=a+b-(a=b);
		System.out.println("After swapping a is:"+a+ "\nAfter swapping b is :"+b);
		}
	public MathOp() {
		int a=6,b=5;
		int c=a|b;
		System.out.println("0 parameter constructer:"+c);
	}
	
	public MathOp(String intro){
		System.out.println(intro);
		}

	public static void main(String[] args) {
		MathOp mp=new MathOp();
		mp.show();
		mp.swap();
		MathOp mpMathOp=new MathOp("My name is Sarvesh Pandey");
	}

}
