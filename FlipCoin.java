package org.bridgeit.dayOne;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Toss coin");
		sc.nextLine();
		int t = r.nextInt(2) + 1;
		System.out.println("Random no is " + t);
		int head = 0;
		int tail = 0;
		if (t == 2) {
			head++;
		} else {
			tail++;
		}
		int perOfHead = (head / t) * 100;

		int perOfTail = (tail / t) * 100;
		System.out.println("Percentage of head= " + perOfHead);
		System.out.println("Percentage of tail= " + perOfTail);

	}

}
