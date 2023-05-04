package com.java8.Interface;

@FunctionalInterface
interface MyInterfaceOne{
	public void m1();
}

public class MyClassOne {

	public static void main(String[] args) {
             MyInterfaceOne mit=()->System.out.println("Hi");
             mit.m1();

	}

}
