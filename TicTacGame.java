package org.bridgeit.dayOne;

import java.util.Scanner;

public class TicTacGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int r = sc.nextInt();
		System.out.println("enter the column size");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("enter " + r * c + " elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean res = tictac(arr);
		if (res) {
			System.out.println("some blocks matched");
		} else {
			System.err.println("no match found");
		}

	}

	static boolean tictac(int arr[][]) {
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= arr[i].length; j++) {
				if (j == 1 && j == 2 && j == 3) {
					return true;
				} else if (i == 1 && i == 2 && i == 3) {
					return true;
				} else if (i == j) {
					return true;
				} else if (i + j == arr.length + 1) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

}
