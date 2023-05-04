package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer=(name)->System.out.println(name+": Good Morning");
		consumer.accept("Sarvesh");
		
		//Number print by forEqach loop
		List<Integer> asList = Arrays.asList(10,20,30,40);
		asList.forEach(i->System.out.println(i));

	}

}
