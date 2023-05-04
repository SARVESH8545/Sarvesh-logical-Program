package com.date;

import java.time.LocalDate;

public class LocalDate1 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomarrow=date.plusDays(2);
		System.out.println("Today :"+date);
		System.out.println("Yesterday"+yesterday);
		System.out.println("Tomarrow"+tomarrow);
		

	}

}
