package com.qa.javaprograms;

public class PrimeNumList {
	public static void main(String[] args) {
		int num = 100;
		boolean isPrime = true;
		for (int i = 2; i <= num; i++) {
			int sq = (int) Math.sqrt(i);
			for (int j = 2; j <= sq; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(" " + i);
			}
			isPrime = true;
		}
	}
}