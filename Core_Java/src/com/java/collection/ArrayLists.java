package com.java.collection;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("abcd");
		al.add(200.50);
		al.add(4452);
		al.add("xyz");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.size());
		

	}

}
