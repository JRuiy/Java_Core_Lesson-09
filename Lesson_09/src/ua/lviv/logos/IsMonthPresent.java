/*
 * LOGOS It Academy Homework Lesson 9
 * 
 * */
package ua.lviv.logos;

import ua.lviv.logos.Aplication.Month;

public class IsMonthPresent {

	/**
	 * @param array Month and String month
	 * @return flag if month exist
	 * */
	/*Check if input month exist*/
	static boolean isMonthPresent(Month[] mas, String month) {
		boolean flag = false;

		for (Month m : mas) {
			if (m.name().equals(month)) {
				System.out.println("Місяць існує");
				flag = true;
			}
		}
		return flag;
	}
	
}
