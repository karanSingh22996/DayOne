package org.bridgeit.dayOne;

import java.util.Scanner;

public class HarmonicValue {
	public static double harmonic(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (1.0 / i);
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		double sum = harmonic(n);
		System.out.println("Harmonic " + n + " number is " + sum);

	}

}
