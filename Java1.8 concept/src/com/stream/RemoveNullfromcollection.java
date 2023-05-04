package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullfromcollection {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("sarvesh",null,"Pandey",null,"ECE");
		list.stream().filter(l->l!=null).forEach(l->System.out.println(l));
		List<String> l2=list.stream().filter(l->l!=null).collect(Collectors.toList());
		System.out.println(l2);
		
		list.stream().filter(l->l!=null).forEach(System.out::println);
		
		}

}
