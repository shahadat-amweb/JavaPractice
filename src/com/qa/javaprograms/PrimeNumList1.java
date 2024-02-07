package com.qa.javaprograms;

public class PrimeNumList1 {
	public static void main(String[] args) {
		int num = 100;
		
		m1(num);
	}
	
	public static void m1(int m) {
		for(int i=1;i<=m;i++) {
			checkForPrimeNumber(i);
		}
	}
	public static void checkForPrimeNumber(int n) {
		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <=Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.print(" "+n);
		} 
	}
}
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97