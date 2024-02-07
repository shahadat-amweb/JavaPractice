package com.qa.javaprograms;

public class StringReverse2 {

	public static void main(String[] args) {
		String name = "name"; // anem
		int length = name.length();
		int halfLength = length / 2;

		// Split the string into two parts
		String firstPart = name.substring(0, halfLength);
		String secondPart = name.substring(halfLength);

		// Reverse the first part
		String reversedFirstPart = new StringBuilder(firstPart).reverse().toString();

		// Reverse the second part
		String reversedSecondPart = new StringBuilder(secondPart).reverse().toString();

		// Combine the reversed second part and the first part
		String reversedName = reversedFirstPart + reversedSecondPart;

		// Print the final reversed string
		System.out.println(reversedName);

	}

}
