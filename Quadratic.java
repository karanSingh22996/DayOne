package org.bridgeit.dayOne;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter quadratic equation as (a*x^2+b*x+c");
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println("enter c");
		int c = sc.nextInt();
		System.out.println("Quadratic equations is " + a + "x^2+ " + b + "x+ " + c);
		double disc = (b * b - 4 * a * c) / 2 * a, root1, root2;
		double d = Math.sqrt(disc);
		if (disc > 0) {
			System.out.println("Roots are real and unequal");

			root1 = (-b + d) / 2 * a;
			System.out.println("Root one = " + root1);
		} else if (disc == 0) {
			System.out.println("roots are real and equal");
			root2 = (-b - d) / 2 * a;
			System.out.println("Root one = " + root2);
		} else {
			System.out.println("Roots are imaginary");
		}
	}

}
