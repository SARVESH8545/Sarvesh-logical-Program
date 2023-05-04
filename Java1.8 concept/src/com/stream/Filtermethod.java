package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtermethod {

	public static void main(String[] args) {
		ArrayList<Integer> numberList=new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(25);
		numberList.add(30);
		numberList.add(35);
		System.out.println("Main Collection :"+numberList);
         
		//List<Integer> numberList=Arrays.asList(10,20,25,30,35);
		List<Integer> evenList=new ArrayList<>();

		evenList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Filtered Output :"+evenList);

		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);

		List<String> nameList=Arrays.asList("Sarvesh","Pandey","Rohan","RohanPandey","yusgd");
		List<String> longnameList=new ArrayList<>();
		//longnameList=nameList.stream().filter(s->s.length()>4 && s.length()<8).collect(Collectors.toList());
		//System.out.println(longnameList);
		//nameList.stream().filter(s->s.length()>4 && s.length()<8).forEach(str->System.out.println(str));
		nameList.stream().filter(s->s.length()>4 && s.length()<8).forEach(System.out::println);
	}

}
