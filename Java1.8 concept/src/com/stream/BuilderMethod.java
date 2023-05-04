package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuilderMethod {

	public static void main(String[] args) {
		Stream<String> st=Stream.<String>builder().add("aa").add("bb").add("dd").build();
		st.forEach(System.out::println);

		//Genrate

		Stream< String> st1=Stream.generate(()->"hello").limit(5);
		st1.forEach(System.out::println);

		Stream<Integer> st2=Stream.iterate(10, i->i+2).limit(10);

		st2.forEach(System.out::println);



		Stream<Integer> st3=Stream.iterate(2, i->i*2);

		List<Integer> l1=st3.skip(3).limit(5).collect(Collectors.toList());

		System.out.println(l1);
	}

}
