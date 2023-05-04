package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println("print the collection object");
		System.out.println("=======By using for loop===============");
		for (int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("============for-Each loop=============");
		for (Object object : al) {
			System.out.println(object);

		}
		System.out.println("==================by iterator===========");
		Iterator iterator=al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("===========By ListIterator================");
		ListIterator listIterator=al.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println("=====forEach ( ) Approach=====");

		// Approach-5
		al.forEach(i -> {
			System.out.println(i);
		});




	}

}
