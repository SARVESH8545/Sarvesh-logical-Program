package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("bus","car","bicysle","flight","Train");
		//Before java 8
		//		for (String string : list) {
		//			System.out.println(string.toUpperCase());
		//		}
		//		
		//		// Java
		//		//list.stream().map(vname->vname.toUpperCase()).forEach(name->System.out.println(name));
		List<String> li=list.stream().map(vname->vname.toUpperCase()).collect(Collectors.toList());
		System.out.println(li);
		//         
		  list.stream().map(s->s.length()).forEach(l->System.out.println(l));
		  System.out.println("=============================================");
		 // list.stream().map(s->s.length()).forEach(System.out::println);
		  System.out.println("=============================================");

		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		  list1.stream().map(n->n*3).forEach(m->System.out.println(m));
		      
	}

}
