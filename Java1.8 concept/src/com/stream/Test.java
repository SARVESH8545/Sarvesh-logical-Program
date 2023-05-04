package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,20,25,30);
		System.out.println("List :"+list);
		List<Integer> list2=new ArrayList<>();
//	for (Integer n : list) {
//		if(n%2==0) {
//			list2.add(n);
//		
//	}
//		}
//	System.out.println("Even Element :"+list2);
		//list2=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(list2);
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		

	}
}
