package org.bridgeit.dayOne;

import java.util.Scanner;

public class SumOfIntegers {
	static void sumZero(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				for (int k = j + 1; k < ar.length; k++) {
					if (ar[i] + ar[j] + ar[k] == 0) {
						System.out.print(ar[i] + " " + ar[j] + " " + ar[k]);
					} 

				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " integers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sumZero(arr);

	}

}
