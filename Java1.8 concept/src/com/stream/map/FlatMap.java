package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);

		List<List<Integer>> finaList=Arrays.asList(lst1,lst2,lst3);
		//System.out.println(finaList);
		List<Integer>	finalresult=finaList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(finalresult);
	}

}
