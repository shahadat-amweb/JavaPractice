package com.qa.javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 3 5 8 13
		int first = 0;
		int second = 1;
		int sum = 0;
		System.out.println(first);
		System.out.println(second);
		for (int i = 1; i < 10; i++) {
			sum = first + second;
			System.out.println(sum);
			 first = second;
			second = sum;

		}

	}

}
