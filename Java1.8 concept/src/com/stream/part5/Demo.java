package com.stream.part5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		//Non terminal method
		// distinct(),limit()

		List<String> name=Arrays.asList("bus","car","bycle","bus","bike","car");
		//		          List<String> res=name.stream().distinct().collect(Collectors.toList());
		//		          System.out.println(res);//[bus, car, bycle, bike]

		name.stream().distinct().forEach(s->System.out.println(s));

		//count Terminal method
		long count=name.stream().distinct().count();
		System.out.println(count);//4

		// limit  
		List<String>	result=name.stream().limit(3).collect(Collectors.toList());
		System.out.println(result);// [bus, car, bycle]


	}

}
