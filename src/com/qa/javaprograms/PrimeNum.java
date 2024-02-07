package com.qa.javaprograms;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 14;
		boolean flag = true;
		if (num <= 1) {
			flag = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
}