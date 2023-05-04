package com.java_polymorphism_overrriding;

class Bank{
	int rateOfIntrest() {
		return 5;
	}
}

class HDFC extends Bank{
	int rateOfIntrest() {
		return 6;
	}
}

class Axis extends Bank{
	int rateOfIntrest() {
		return 7;
	}
}

class SBI extends Bank{
	int rateOfIntrest() {
		return 8;
	}
}

public class Test {

	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.rateOfIntrest());
		Axis axis=new Axis();
		System.out.println(axis.rateOfIntrest());
		SBI sbi=new SBI();
		System.out.println(sbi.rateOfIntrest());


	}

}
