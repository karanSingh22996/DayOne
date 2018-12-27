package org.bridgeit.dayOne;

import java.util.Scanner;

public class LeapYear {
	public static boolean isLeap(int year) {
		boolean res = true;
		if (year % 400 == 0 || year % 4 == 0 & year % 100 != 0) {
			return res;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year to check if leap or not");
		int year = sc.nextInt();
		boolean res = isLeap(year);
		if (res) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}

	}

}
