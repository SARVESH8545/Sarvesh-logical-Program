package com.java8.consumer;

import java.util.function.Consumer;
import java.util.zip.CRC32;

public class Consumer8 {

	public static void main(String[] args) {
		Consumer<Integer> c3=n->System.out.println(n);
		c3.accept(50);
//		
		Consumer<String> c4=s->System.out.println(s);
		c4.accept("Sarvesh");
		
		//Consumer chaining
		Consumer<String> c=s->System.out.println(s+" "+"is white");
		Consumer<String> c1=s->System.out.println(s+" "+"is foure legs");
		Consumer<String> c2=s->System.out.println(s+" "+"is eating grass");
//		c.accept("cow");
//		c1.accept("cow");
//		c2.accept("cow");
		//c.andThen(c1).andThen(c2).accept("cow");
		Consumer<String> c5=c.andThen(c1).andThen(c2);
		c5.accept("cow");

	} 

}
