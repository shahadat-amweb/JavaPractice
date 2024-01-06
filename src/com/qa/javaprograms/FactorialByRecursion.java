package com.qa.javaprograms;

public class FactorialByRecursion {

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));// 5*f4x
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is: " + factorial(5));
	}
}
