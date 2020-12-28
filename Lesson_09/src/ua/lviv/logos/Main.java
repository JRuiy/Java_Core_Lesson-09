/*
 * LOGOS It Academy Homework Lesson 9
 * 
 * */
package ua.lviv.logos;

import java.util.Scanner;

import ua.lviv.logos.Aplication.Month;
import ua.lviv.logos.Aplication.Seasons;

/**
 * @author Vadim_Khodorovskyi
 * @since java 1.8
 * @version 1.1
 */
public class Main {
	public static void main(String[] args) throws WrongInputConsoleParametersException {

		/* Array of Seasons */
		Seasons[] sea = Seasons.values();
		/* Array of Month */
		Month[] mas = Month.values();
		/* Scanner Input */
		Scanner sc = new Scanner(System.in);

		/* Cycle for homework */
		while (true) {
			Menu.menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Введіть місяць: ");
				/* Scanner Input */
				sc = new Scanner(System.in);
				/* Input month */
				String month = sc.next().toUpperCase();

				boolean flag = IsMonthPresent.isMonthPresent(mas, month);

				if (!flag) {
					String massege = "Такого місяця не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
				break;
			}

			case "2": {
				System.out.println("Введіть пору року: ");
				/* Scanner Input */
				sc = new Scanner(System.in);
				/* Input Season */
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				/* Check if seasons exist in this seasons */
				for (Month m : mas) {
					if (m.getSeasons().name().equals(seasonSc)) {
						flag = true;
					}
				}
				/* flag true, so print all month of input season */
				if (flag) {
					for (Month mon : mas) {
						if (mon.getSeasons().name().equals(seasonSc)) {
							System.out.println(mon);
						}
					}
				}
				/* flag false, so throw WrongInputConsoleParametersException */
				if (!flag) {
					String massege = "Такої пори року не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
				break;
			}
			case "3": {
				System.out.println("Введіть кількість днів в місяці");
				sc = new Scanner(System.in);
				/* Number of day per month */
				int monthDays = sc.nextInt();

				boolean flag = false;
				/* Check if there are months with input number of days */
				for (Month m : mas) {
					if (m.getDays() == monthDays) {
						flag = true;
					}
				}
				/* Flag true, so print month with so many days */
				if (flag) {
					for (Month mon : mas) {
						if (mon.getDays() == monthDays) {
							System.out.println(mon);
						}
					}
				}
				/* flag false, so throw WrongInputConsoleParametersException */
				if (!flag) {
					String massege = "Місяця з такою кількостю днів не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
				break;
			}
			case "4": {
				System.out.println("Введіть кількість днів в місяці");
				sc = new Scanner(System.in);
				/* Number of day per month */
				int monthDays = sc.nextInt();

				boolean flag = false;
				/* Checks for months with fewer days than entered */
				for (Month m : mas) {
					if (m.getDays() < monthDays) {
						flag = true;
					}
				}
				/* Flag true, so print month with fewer days */
				if (flag) {
					for (Month mon : mas) {
						if (mon.getDays() < monthDays) {
							System.out.println(mon);
						}
					}
				}
				/* flag false, so throw WrongInputConsoleParametersException */
				if (!flag) {
					String massege = "Місяців з меншою кількостю днів не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
				break;
			}
			case "5": {
				System.out.println("Введіть кількість днів в місяці");
				sc = new Scanner(System.in);
				/* Number of day per month */
				int monthDays = sc.nextInt();

				boolean flag = false;
				/* Checks for months with more days than entered */
				for (Month m : mas) {
					if (m.getDays() > monthDays) {
						flag = true;
					}
				}
				/* Flag true, so print month with more days */
				if (flag) {
					for (Month mon : mas) {
						if (mon.getDays() > monthDays) {
							System.out.println(mon);
						}
					}
				}
				/* flag false, so throw WrongInputConsoleParametersException */
				if (!flag) {
					String massege = "Місяців з більшою кількостю днів не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
				break;
			}
			case "6": {
				System.out.println("Введіть пору року: ");
				sc = new Scanner(System.in);
				/* Input season */
				String seasons = sc.next().toUpperCase();

				boolean flag = false;
				/* Checks whether the entered season exists */
				for (Seasons s : sea) {
					if (s.name().equals(seasons)) {
						flag = true;
					}
				}
				/* Flag true, so print next season */
				if (flag) {
					Seasons sea2 = Seasons.valueOf(seasons);
					int ordinal = sea2.ordinal();

					if (ordinal == (sea.length - 1)) {
						ordinal = 0;
						System.out.println(sea[ordinal]);
					} else {
						System.out.println(sea[ordinal + 1]);
					}
				}
				break;
			}
			case "7": {
				System.out.println("Введіть пору року: ");
				sc = new Scanner(System.in);
				/* Input season */
				String seasons = sc.next().toUpperCase();

				boolean flag = false;
				/* Checks whether the entered season exists */
				for (Seasons s : sea) {
					if (s.name().equals(seasons)) {
						flag = true;
					}
				}
				/* Flag true, so print previous season */
				if (flag) {
					Seasons sea2 = Seasons.valueOf(seasons);
					int ordinal = sea2.ordinal();

					if (ordinal == 0) {
						ordinal = sea.length - 1;
						System.out.println(sea[ordinal]);
					} else {
						System.out.println(sea[ordinal - 1]);
					}
				}
				break;
			}
			case "8": {
				/* Displays all months that have an even number of days */
				for (Month mon : mas) {
					if (mon.getDays() % 2 == 0) {
						System.out.println("Місяці, які мають парну кількість днів: " + mon);
					}
				}
				break;
			}
			case "9": {
				/* Displays all months that have an odd number of days */
				for (Month mon : mas) {
					if (mon.getDays() % 2 != 0) {
						System.out.println("Місяці, які мають непарну кількість днів: " + mon);
					}
				}
				break;
			}
			case "10": {
				System.out.println("Введіть місяць: ");
				sc = new Scanner(System.in);
				/* Input month */
				String month = sc.next().toUpperCase();

				boolean flag = IsMonthPresent.isMonthPresent(mas, month);
				/* Compares the kept month with constants and returns it */
				Month mon2 = Month.valueOf(month);

				if (flag) {
					/* Checks whether the entered month has an even or odd number of days */
					if (mon2.getDays() % 2 == 0) {
						System.out.println("Даний місяць має парну кількість днів");
					} else {
						System.out.println("Даний місяць має непарну кількість днів");
					}
				}
				/* flag false, so throw WrongInputConsoleParametersException */
				if (!flag) {
					String massege = "Вказаного місяця не існує";
					throw new WrongInputConsoleParametersException(massege);
				}
			}
			}
		}
	}

}
