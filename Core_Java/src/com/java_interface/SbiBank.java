package com.java_interface;

public class SbiBank implements Bank {

	public static void main(String[] args) {
		SbiBank s=new SbiBank();
		s.moneyTransfer();
		s.checkBalance();

	}


	public void moneyTransfer() {
		System.out.println("Money Transfer");

	}


	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("check balance");

	}

}
