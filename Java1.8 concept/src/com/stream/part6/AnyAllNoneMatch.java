package com.stream.part6;

import java.util.HashSet;
import java.util.Set;

//anymatch, allmatch,nonematch
public class AnyAllNoneMatch {
	public static void main(String[] args) {
		Set<String> fruites= new HashSet<>();
		fruites.add("one apple");
		fruites.add("two apple");
		fruites.add("more apple");
		fruites.add("one mango");
		//anyMatch
		boolean result=fruites.stream().anyMatch(value->{return value.startsWith("one");});
		System.out.println(result);
		
		//allMatch
		boolean result1=fruites.stream().allMatch(value->{return value.startsWith("one");});
		System.out.println(result1);
		
		//noneMatch
				boolean result2=fruites.stream().noneMatch(value->{return value.startsWith("one");});
				System.out.println(result2);


	}
}
