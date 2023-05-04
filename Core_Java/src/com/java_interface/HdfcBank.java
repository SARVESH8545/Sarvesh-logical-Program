package com.java_interface;

public class HdfcBank implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank hdfcBank=new HdfcBank();
		hdfcBank.moneyTransfer();
		hdfcBank.checkBalance();

	}

	@Override
	public void moneyTransfer() {
		System.out.println("Money Transfer");

	}

	@Override
	public void checkBalance() {
		System.out.println("Check Balance");

	}

}
