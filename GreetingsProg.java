package org.bridgeit.dayOne;

import java.util.Scanner;

public class GreetingsProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your naame");
		String name = sc.next();
		System.out.println("Hello " + name + " How are you");
	}

}
