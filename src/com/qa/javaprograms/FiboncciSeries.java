package com.qa.javaprograms;

public class FiboncciSeries {

	public static void main(String[] args) {
		// 1 1 2 3

		int first = 0;
		int second = 1;
		int sum = 0;

		for (int i = 1; i < 10; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + " ");
		}
	}
}