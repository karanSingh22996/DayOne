package org.bridgeit.dayOne;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x-distace");
		int x = sc.nextInt();
		System.out.println("enter y-distance");
		int y = sc.nextInt();
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Euclidean's distance= " + distance);
	}

}
