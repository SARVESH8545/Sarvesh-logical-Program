package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");
		//javacourses.stream().limit(3).forEach(s->System.out.println(s));
		javacourses.stream().skip(3).forEach(s->System.out.println(s));

		List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names.stream().distinct().forEach(name -> System.out.println(name));


	}

}
