package com.stream.part6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
public static void main(String[] args) {
	
	//List<String> list=Arrays.asList("one","two","three","four");
	//List<String> list=Arrays.asList();
	//Optional<String> result=list.stream().findAny();
	//System.out.println(result.get());
	
	List<String> list=Arrays.asList("one","two","three","four");
	//List<String> list=Arrays.asList();
	Optional<String> result=list.stream().findFirst();
	System.out.println(result.get());
	
	
	
}
}
