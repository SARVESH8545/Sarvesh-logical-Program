package com.stream.part5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		List<String> numList=Arrays.asList("A","B","C","1","2","3");
		//reduce()
//		Optional<String>res =numList.stream().reduce((value,combinevalue)->{
//			return combinevalue+value;
//			
//		});
//		
//		System.out.println(res.get());
		
		// toArray()
	Object arr[]=numList.stream().toArray();
	for (Object object : arr) {
		System.out.println(object);
		
	}
	}

}
