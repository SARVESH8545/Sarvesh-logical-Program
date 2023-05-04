package com.java8.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		System.out.println("-------------------------");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(date);
		System.out.println(format);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(date);
		System.out.println(format2);

		// Convert String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20");
		System.out.println(parsedDate);
		
	}

}
