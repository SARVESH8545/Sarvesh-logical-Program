package com.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program started");
		int a=100;
		try {
			System.out.println(a/0);
//		} catch (ArithmeticException e) {
		//}catch (ArrayIndexOutOfBoundsException e) {
		//}catch (Exception e) {
			System.out.println("Inter in The catch block");
		
		}finally {
			System.out.println("Enter in the finally block");
		}
		System.out.println("Program ended");
	}

}
