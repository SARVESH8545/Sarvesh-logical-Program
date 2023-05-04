package com.java8.dateandtime;

import java.time.LocalDate;

public class NewDateDemo {

	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2221, 1, 20);
		System.out.println(of);
		System.out.println("------------------");
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println("---------------");
		LocalDate plusDays = date.plusDays(3);
		System.out.println(plusDays);
		
	}

}
