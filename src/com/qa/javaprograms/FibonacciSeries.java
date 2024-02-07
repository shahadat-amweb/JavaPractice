package com.qa.javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21
		int first = 0;
		int second = 1;
		int sum = 0;
		System.out.print(first + " " + second);

		for (int i = 1; i < 10; i++) {
			sum = first + second;
			System.out.print(" " + sum);
			first = second;
			second = sum;

		}

	}

}
