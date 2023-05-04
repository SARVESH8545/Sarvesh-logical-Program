package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HCL_Trainee {

	public static void main(String[] args) {
		String str[]=new String[] {"AA","BB","CC"};
		Stream<String> stream=Arrays.stream(str);
		stream.forEach(s->System.out.println(s));

		List<String> list=new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("ccc");
		Stream<String> st=list.stream();
		st.forEach(System.out::println);

		Stream<String> stream2=Stream.of("A","B","C");
		stream2.forEach(System.out::println);

		System.out.println("=================================");
		List<String> l1=Arrays.asList("123","1234","asdf","12345","lkjh");
		
		Stream<String> st2=l1.stream();
		Stream<String> st3=st2.distinct();
		long len=st3.count();
		System.out.println(len);
		System.out.println("-----------------------------------------------");
		boolean b1=l1.stream().distinct().anyMatch((s1)->s1.startsWith("123"));
		System.out.println(b1);
		
		
		System.out.println("============================================");
		boolean b2=l1.stream().distinct().allMatch((s1)->s1.startsWith("as"));
		System.out.println( b2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
