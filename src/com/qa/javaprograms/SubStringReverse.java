package com.qa.javaprograms;

public class SubStringReverse {

	public static void main(String[] args) {
		String input = "Hello India I m Shahadat Khan";
		reverseStr(input);
	}

	public static void reverseStr(String inputString) {
		String[] subStrings = inputString.split(" ");
		for (String s : subStrings) {
			int len = s.length();
			String rev = "";
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
			}
			System.out.print(" " + rev);
		}
	}
}