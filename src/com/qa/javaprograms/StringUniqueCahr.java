package com.qa.javaprograms;

public class StringUniqueCahr {
	// Find first non repeated/unique character in a String
	public static void main(String[] args) {
		String s = "abceabc";
		for (int i = 0; i < s.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique == true) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}