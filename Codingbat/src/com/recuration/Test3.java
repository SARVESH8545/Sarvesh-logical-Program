package com.recuration;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	//	public void email() {
	//		
	//		System.out.println("maulana@gmail.com");
	//	
	//	}
	//
	//	public static void main(String[] args) {
	//		Test3 test3=new Test3();
	//		
	//	test3.email();
	// @formatter:on




	public static void main(String[] args) {

		ArrayList list1=new ArrayList();
		list1.add("2");
		list1.add("test");
		list1.add("3");
		list1.add("16");
		list1.add("9");
		list1.add("1");
		System.out.println("Array1: "+list1);

		ArrayList list2=new ArrayList();//[5 , 6, 12, 7 , ‘ key’, 3 ]
		list2.add("5");
		list2.add("6");
		list2.add("12");
		list2.add("7");
		list2.add("key");
		list2.add("3");
		System.out.println("Array2: "+list2);
		
		ArrayList l3=new ArrayList<>();
		l3.add(list1);
		l3.add(list2);
		for (Object o: l3) {
			System.out.println(o);
			
		}

	}

}
