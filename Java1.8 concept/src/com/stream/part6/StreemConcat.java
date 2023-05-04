package com.stream.part6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreemConcat {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Dog","Cat","Elephant");
		List<String> list2=Arrays.asList("peackok","parrot","crow");
		
	Stream<String> s1=list1.stream();
	Stream<String> s2=list2.stream();
	List<String> result=Stream.concat(s1, s2).collect(Collectors.toList());
	System.out.println(result);
	}

}
