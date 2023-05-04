package com.java8.predicate;

import java.math.MathContext;
import java.util.function.Supplier;


public class Test {

	public static void main(String[] args) {
		Supplier supplier=()->new MathContext(2);
		System.out.println(supplier.get());
		
		

	}

}
