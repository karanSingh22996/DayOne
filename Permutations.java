package org.bridgeit.dayOne;

import java.util.Scanner;

public class Permutations {

	static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	static void permutations(char[] ch, int currentIndex) {
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		permutations(ch, 0);
	}
}
