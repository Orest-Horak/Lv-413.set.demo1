package ua.edu.softserve.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysOfWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {

		DayOFWeek numberOFWeek = DayOFWeek.SUNDAY;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of week:");
		int n = Integer.parseInt(br.readLine());
		switch (n) {
		case 1:
			numberOFWeek = DayOFWeek.SUNDAY;
			break;
		case 2:
			numberOFWeek = DayOFWeek.MONDAY;
			break;
		case 3:
			numberOFWeek = DayOFWeek.TUESDAY;
			break;
		case 4:
			numberOFWeek = DayOFWeek.WEDNESDAY;
			break;
		case 5:
			numberOFWeek = DayOFWeek.THURSDAY;
			break;
		case 6:
			numberOFWeek = DayOFWeek.FRIDAY;
			break;
		case 7:
			numberOFWeek = DayOFWeek.SATURDAY;
			break;
		default:
			System.out.println("PLS Enter correct number of week's day");
			break;

		}
		if (n >= 1 && n <= 7) {
			System.out.println("en: " + numberOFWeek.getEn() + " ua: " + numberOFWeek.getUa());
		}

	}
}
