package com.qa.javaprograms;

public class NumberRev {

	public static void main(String[] args) {
		int num = 123;
		int rem, sum = 0;
		// 123
		while (num > 0) {
			rem = num % 10; // 3 2 1
			sum = sum * 10 + rem; // 3 32 321
			num = num / 10; // 12 1 0

		}
		System.out.println(sum);
	}
}
