package com.date;

import java.time.LocalDate;

public class LocalDate2 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2013,12,13);
		System.out.println(date.isLeapYear());
		
		LocalDate date2=LocalDate.of(2016,12, 12);
		System.out.println(date2.isLeapYear());

	}

}
