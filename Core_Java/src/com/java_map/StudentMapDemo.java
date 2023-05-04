package com.java_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {

	public static void main(String[] args) {
		Map<Integer,Student> map=new HashMap<>();
		map.put(101,new Student(1,"Ram"));
		map.put(102,new Student(2,"shaym"));
		map.put(103,new Student(3,"abc"));
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
			}
		Collection<Student> values = map.values();
		for (Student student : values) {
			System.out.println(student);
			
		}
		Set<Entry<Integer, Student>> entrySet = map.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry);
			
		}

	}

}
