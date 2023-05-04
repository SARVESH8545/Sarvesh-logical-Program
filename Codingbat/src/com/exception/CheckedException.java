package com.exception;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("Program started");
	System.out.println("Program is progress");
//	 try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	Thread.sleep(3000);
	System.out.println("Program exeuted ");
	System.out.println("Peogram ended");
		
	}

}
