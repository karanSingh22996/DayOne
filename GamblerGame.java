package org.bridgeit.dayOne;

import java.util.Random;
import java.util.Scanner;

public class GamblerGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int goal = 100;
		int win = 0;
		int loss = 0;
		int trials = 0;
		int sum = 0;

		while (true) {
			trials++;
			System.out.println("enter the number between 1 and 6 ");
			System.out.println("what is your stake");
			int stake = sc.nextInt();

			int res = r.nextInt(6) + 1;
			if (stake == res) {
				win++;
			} else {
				loss++;
			}
			if (sum + res <= goal) {

				sum = sum + res;
			}
			if (sum == goal)
				break;
		}
		System.out.println("Total number of trials " + trials);
		System.out.println("Total win = " + win);
		System.out.println("Total lose = " + loss);
		double winPercent = win * 100 / trials;
		System.out.println("Winning percentage = " + winPercent);
		double lossPercent = loss * 100 / trials;
		System.out.println("Losing percentage = " + lossPercent);

	}
}