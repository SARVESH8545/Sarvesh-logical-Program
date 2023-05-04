package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Task-1 : Print emp names who are working in Hyd location in DB team.

class Employee{
	int id;
	String name;
	String dept;
	Employee(int id,String name,String dept) {
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
}

public class PredicateJoinDemo {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Jhon","JAVA");
		Employee e2=new Employee(102,"Shyam","DB");
		Employee e3=new Employee(103,"RAM","Devops");
		Employee e4=new Employee(104,"Mohan","Testing");

		List<Employee> emps=Arrays.asList(e1,e2,e3,e4);
		Predicate<Employee> p1 = (e) -> e.id==102;
		Predicate<Employee> p2 = (e) -> e.dept.equals("DB");
		Predicate<Employee> p3 = (e) -> e.name.startsWith("S");
		
		// Predicate Joining
				Predicate<Employee> p = p1.and(p2).and(p3);

				for (Employee e : emps) {
					if (p.test(e)) {
						System.out.println(e.name);
					}
				}
	}

}
