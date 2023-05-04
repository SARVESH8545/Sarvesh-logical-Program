package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");
		List<List<String>> asList = Arrays.asList(javacourses,uicourses);
		//asList.stream().forEach(s->System.out.println(s));
		Stream<String> flatMap = asList.stream().flatMap(s->s.stream());
		flatMap.forEach(s->System.out.println(s));

	}

}
