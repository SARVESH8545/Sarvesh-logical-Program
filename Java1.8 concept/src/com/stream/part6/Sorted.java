package com.stream.part6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> l=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		
		 List<Integer> list2=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> l3=Arrays.asList("Sarvesh","Pandey","Ece","Ram","Mohan");
		List<String> l4=l3.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		
		List<String> list5=l3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list5);
		
	}

}
