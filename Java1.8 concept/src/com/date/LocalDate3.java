package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate3 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2021,01,24);
		LocalDateTime dateTime=date.atTime(8,10,30);
		System.out.println(dateTime);
	}

}
