package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(6,10,7,20,8,30,40);
		al.stream().filter(i->i>10).forEach(i->System.out.println(i));
		
				List<String> name=Arrays.asList("Sarvesh","Pandey");
				name.stream().filter(i->i.startsWith("S")).forEach(i->System.out.println(i));
	}

}
