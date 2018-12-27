package org.bridgeit.dayOne;

import java.util.*;

public class TimeElapsed {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println(new Date() + " ");
		Thread.sleep(1500);
		System.out.println(new Date() + " ");
		long end = System.currentTimeMillis();

		long elapsed = end - start;
		System.out.println("total elapsed time = " + elapsed);

	}
}
