package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Task-2 : Take list of persons and print persons whose age is >= 18 using Lambda Expression

class Person{
	int age;
	String name;
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
	}

}
public class PredicatePersonsDemo {

	public static void main(String[] args) {

		Person p1 = new Person("John", 26);
		Person p2 = new Person("Smith", 16);
		Person p3 = new Person("Raja", 36);
		Person p4 = new Person("Rani", 6);
		List<Person > list=Arrays.asList(p1,p2,p3,p4);
		Predicate<Person> predicate=(p)->p.age>=18;
		for (Person person : list) {
			if (predicate.test(person)) {
				System.out.println(person.name);

			}

		}

	}

}


