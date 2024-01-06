package com.qa.javaprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCharSwappingI {
// swap h with second last a 
	public static void main(String[] args) {
		String input = "shahadat";

		// Check if the string has at least two characters
		if (input.length() < 2) {
			System.out.println("String is too short to perform the swap.");
			return;
		}

		// Convert the string to a character array
		char[] charArray = input.toCharArray();
		int len = charArray.length;

		// Swap the second and second-last characters
		char temp = charArray[1];
		charArray[1] = charArray[len - 2];
		charArray[len - 2] = temp;

		// Convert the character array back to a string
		String result = new String(charArray);

		System.out.println("Original String: " + input);
		System.out.println("String after swapping: " + result);

	}
}