package com.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Persion{
	String name;
	String country;

	public Persion(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", country=" + country + "]";
	}

}


public class CollectorsDemo {

	public static void main(String[] args) {
		Persion p1=new Persion("Jhon","Japan");
		Persion p2=new Persion("shyam","India");
		Persion p3=new Persion("chrics","US");
		Persion p4=new Persion("scott","Tokyo");
		List<Persion> list = Arrays.asList(p1,p2,p3,p4);
		List<Persion> indians = list.stream()
				.filter(p->p.country.equals("India"))
				.collect(Collectors.toList());
		indians.forEach(i->System.out.println(i));

	}

}
