// 19/06/2013

package quiz;
import helpers.Day;

//BlueJ project: dayOfTheWeek
//Video: Day of the Week

public class WhatDayWillItBe {
 public static void main(String[] args) {
	 Day birthday = new Day(1900, 1, 19);
     // We may change this value when we run your program
     // It will always be a date >= January 1, 1900
     Day refDate = new Day(1900, 1, 1);
     int refWeekDay = 1;
     int diffDay = birthday.daysFrom(refDate);
     int weekday = (refWeekDay + diffDay) % 7;
     
     //System.out.println(diffDay);
     System.out.print("Weekday: ");
     System.out.println(weekday);
 }
}