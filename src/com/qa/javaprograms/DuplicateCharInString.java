package com.qa.javaprograms;

public class DuplicateCharInString {
//find the duplicate characters in the string
	public static void main(String[] args) {
		// Java Program to find the duplicate characters in a given string
		String str1 = "shahadat khan";
		int count;
		// Converts given string into character array
		char str[] = str1.toCharArray();
		System.out.println("Duplicate characters in the given string: ");
		// Counts each character present in the string
		int len = str.length;
		for (int i = 0; i < len; i++) {
			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (str[i] == str[j] && str[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					str[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && str[i] != '0')
				System.out.println(str[i]);
		}
	}
}