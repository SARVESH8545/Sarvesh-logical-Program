package com.java;


 class Bank{
	 double rateOfIntrest() {
		 return 0;
		 	 }
}
 
 class SBI extends Bank{
	 double rateOfIntrest() {
		 return 10.7;
		 	 }
}
 
 class ICICI extends Bank{
	 double rateOfIntrest() {
		 return 8.5;
		 	 }
}
 class Axis extends Bank{
	 double rateOfIntrest() {
		 return 9.0;
		 	 }
}
 
public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		System.out.println(sbi.rateOfIntrest());
		ICICI icici=new ICICI();
		System.out.println(icici.rateOfIntrest());
		Axis axis=new Axis();
		System.out.println(axis.rateOfIntrest());

	}

}
