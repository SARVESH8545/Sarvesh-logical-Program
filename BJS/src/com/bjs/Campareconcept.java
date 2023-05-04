package com.bjs;

public class Campareconcept {

	public static void main(String[] args) {
		Integer integer=new Integer(10);
		System.out.println(integer.compareTo(7));//1
		System.out.println(integer.compareTo(15));//-1
		System.out.println(integer.compareTo(10));//0
		
		Double d=new Double(10.001);
		byte b=d.byteValue();
	}

}
/*
 * Wrapper class is class whose contanet permitive data type.where we can easly convert one data type to another 
 * data type.
 * */
 