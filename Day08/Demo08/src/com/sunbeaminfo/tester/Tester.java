package com.sunbeaminfo.tester;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Tester {

	public static void main(String[] args) {
		//Date
		Date d1 = new Date();
		System.out.println(d1);
		
		//Deprecated
		//Date d2 = new Date(1,1,2000);
		//System.out.println(d2);
		
		
		//Calender
		Calendar calendar=  Calendar.getInstance();
		System.out.println(calendar);
		
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println("Date = "+calendar.get(Calendar.DATE)+"/"+(calendar.get(Calendar.MONTH)+1+"/"+calendar.get(Calendar.YEAR)));
		
		calendar.set(Calendar.MONTH, 5);
		System.out.println("Date = "+calendar.get(Calendar.DATE)+"/"+(calendar.get(Calendar.MONTH)+1+"/"+calendar.get(Calendar.YEAR)));
		
		
		//LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2000, 1, 1);
		System.out.println(localDate2);
		
		LocalDate localDate3 = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DATE));
		System.out.println(localDate3);
	}

}
