package com.java8.stream;

import java.util.stream.Stream;
//Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
public class Employee {
	String name;
	int age;
	double salry;



	public Employee(String name, int age, double salry) {

		this.name = name;
		this.age = age;
		this.salry = salry;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salry=" + salry + "]";
	}



	public static void main(String[] args) {

		Employee e1 = new Employee("John", 35, 55000.00);
		Employee e2 = new Employee("David", 25, 45000.00);
		Employee e3 = new Employee("Buttler", 35, 35000.00);
		Employee e4 = new Employee("Steve", 45, 65000.00);
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		stream.filter(e->e.salry>=50000).forEach(s->System.out.println(s.name+"-"+s.age));



	}

}
