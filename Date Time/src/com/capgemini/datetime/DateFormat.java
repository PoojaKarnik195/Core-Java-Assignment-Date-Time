package com.capgemini.datetime;

import java.time.LocalDateTime;

/**
 * @author Pooja Karnik Program to print today's date
 *
 */
public class DateFormat {

	public static void main(String[] args){
		
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
	}
}
