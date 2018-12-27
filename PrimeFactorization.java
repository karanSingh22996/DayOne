package org.bridgeit.dayOne;

import java.util.Scanner;

public class PrimeFactorization {
	public static void factor(int n) {
		
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		System.out.println("prime factors of "+n+" is ");
		factor(n);
	}

}
