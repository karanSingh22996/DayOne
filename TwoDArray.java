package org.bridgeit.dayOne;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int r = sc.nextInt();
		System.out.println("enter the column size");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("enter " + r * c + " numbers");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("entered elements are ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
