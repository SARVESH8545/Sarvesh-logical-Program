package com.java8.lambda;
//Task: Declare names in an array and print names which are starting with 'A' using lambda expression.

import java.util.function.Predicate;

//String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
public class PredicateDemo1 {

	public static void main(String[] args) {
		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
		Predicate<String> predicate=(name)->name.charAt(0)=='A';
		for (String name: names) {
			if (predicate.test(name)) {
				System.out.println(name);
				
			}
			
		}


	}

}
