package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5};
		List<Integer> list=Arrays.asList(a);
		Stream<Integer> st=list.stream().map((e)->e*e);
		st.forEach(System.out::println);

		List<Integer> list1=list.stream().map((e)->e*3).collect(Collectors.toList());
		System.out.println(list1);

		List<Integer> list2=list.stream().flatMap(e->Stream.of(e*2)).collect(Collectors.toList());
		System.out.println(list2);

		System.out.println("---------------------------------------------");
		Set<String> set1=new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("e");
		set1.add("d");
		Set<String> set2=set1.stream().map(r1->r1.toUpperCase()).collect(Collectors.toSet());
		System.out.println(set2);

		System.out.println("---------------------------------------------------------");
		List<String> list3=set2.stream().map(a1->a1.toLowerCase()).collect(Collectors.toList());
		System.out.println(list3);

		List<Integer> list4=Arrays.asList(10,20,30);
		Integer i1=list4.stream().reduce(100,(x,y)->x+y);
		System.out.println(i1);
		System.out.println("---------------------------------------------");
		List<String> list5=Arrays.asList("1","a","d","5","k","M");
		List<String> list6=list5.stream().sorted().collect(Collectors.toList());
		System.out.println(list6);
		System.out.println("--------------------------------------------------");
       
		List<String> list7=list5.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list7);








































	}

}
