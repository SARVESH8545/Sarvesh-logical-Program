package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("aaa",25));
		list.add(new Student("bbb",34));
		list.add(new Student("ccc",28));
		list.add(new Student("ddd",30));
		list.add(new Student("eee",22));
		
		Stream<Student> s1=list.stream().filter((a1)->a1.getAge()>25);
		s1.forEach(System.out::println);
		
		boolean b1=list.stream().noneMatch((a1)->a1.getName().contains("a"));
		System.out.println(b1);
		
	List<Student> list1=list.stream().sorted(Comparator.comparingInt(Student::getAge)).
			collect(Collectors.toList());
	System.out.println(list1);
	
	System.out.println("---------------------------------");
	
	List<Student> list2=list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).
			collect(Collectors.toList());
	System.out.println(list2);
	
	System.out.println("===========================================");
	
	List<Student> list3=list.stream().sorted(Comparator.comparing(Student::getAge)).
			collect(Collectors.toList());
	System.out.println(list3);
	
	}

}
