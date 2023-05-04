package com.java_array;

public class Test implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
		
	}

	public static void main(String[] args) {
	Test test=new Test();
	Thread thread=new Thread(test);
	thread.start();
	thread.start();

	}

}
