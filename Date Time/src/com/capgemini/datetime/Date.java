
package com.capgemini.datetime;

import java.io.*;

/**
 * @author Pooja Karnik Program to change the date format
 *
 */
//taking input in ddmmyyyy format and converting it into dd/mm/yyyy format and dd month name,yyyy format
public class Date {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int stringLength, year, date, month;
		String dd, mm, yyyy;

		// setting the maximum days in a month
		int maxDays[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String monthNames[] = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };

		System.out.println("Enter any date in 8 digits (ddmmyyyy) format: ");

		String dateLen = br.readLine();
		stringLength = dateLen.length();

		if (stringLength == 8) {
			dd = dateLen.substring(0, 2);
			mm = dateLen.substring(2, 4);
			yyyy = dateLen.substring(4);
			date = Integer.parseInt(dd);
			month = Integer.parseInt(mm);
			year = Integer.parseInt(yyyy);

			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
				maxDays[2] = 29;
			}
			if (month < 0 || month > 12 || date < 0 || date > maxDays[month] || year < 0 || year > 9999) {
				System.out.println("The day, month or year are outside acceptable limit");
			} else {
				System.out.println("Date in dd/mm/yyyy format = " + dd + "/" + mm + "/" + yyyy);
				System.out.println("Date in dd,month name,yyyy format = " + dd + " " + monthNames[month] + "," + yyyy);
			}
		} else {
			System.out.println("Wrong Input");
		}
	}
}
