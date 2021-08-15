package org.bridgeit.dayOne;

import java.util.Scanner;

public class PowerOfTwo {
	public static int power(int n, int p) {
		int pow = 1;
		while (p > 0) {
			pow = pow * n;
			p--;
		}
		return pow;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number and power");
		int n = sc.nextInt();
		int p = sc.nextInt();

		int pow = power(n, p);
		System.out.println("Table of two");
		for (int i = 1; i < pow; i++) {
			System.out.println(2 + " * " + i + " = " + 2 * i);

		}

	}

}
