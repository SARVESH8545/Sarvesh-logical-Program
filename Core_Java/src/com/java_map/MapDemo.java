package com.java_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(101,"Sarvesh");
		map.put(102,"Pandey");
		map.put(103,"Ram");
		map.put(null,null);
		map.put(null,"1");

		System.out.println(map.size());
		//System.out.println(map.get(101));
		//System.out.println(map.get(000));
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);

		}
		System.out.println("------------------");
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);

		}

		System.out.println("------------------");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);

		}
		System.out.println(map.containsKey(102));
		System.out.println(map.containsKey(200));
		System.out.println(map.isEmpty());

		map.clear();
		System.out.println(map);
		System.out.println(map.size());

	}

}
