package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MapFirstdemo {

	public static void main(String[] args) {
		//List<String> asList = Arrays.asList("Sarvesh","Pandey","Ram");
		/*
		 * for (String string : asList) { System.out.println(string.toUpperCase());
		 * 
		 * }
		 */
		//asList.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));
		//asList.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));

		List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");

		// print name with its length which are starting with 'A' using Stream API
		//Ashok - 5
		//Anil  - 4
		//Akash - 5
		
		names.stream()
		 .filter(name -> name.startsWith("A"))
		 .map(name -> name + "-" +name.length())
		 .forEach(name -> System.out.println(name));

	}

}
