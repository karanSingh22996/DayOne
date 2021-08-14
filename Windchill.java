package org.bridgeit.dayOne;

import java.util.Scanner;

public class Windchill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature");
		double temp = sc.nextDouble();
		System.out.println("enter the speed of wind");
		double vel = sc.nextDouble();
		double v = Math.pow(vel, 0.16);

		double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * v;
		System.out.println("Effective temprature = " + w);
	}

}
