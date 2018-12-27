package org.bridgeit.dayOne;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("enter the number");
		int n = sc.nextInt();
		int distinct[] = new int[n];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = r.nextInt(n);
			for (int j = 0; j < i; j++) {
				if (distinct[i] == distinct[j])
					i--;
			}

		}
		System.out.println("Total generated distinct coupons are ");
		for (int i = 0; i < distinct.length; i++) {
			System.out.print(distinct[i] + " ");
		}
	}

}
