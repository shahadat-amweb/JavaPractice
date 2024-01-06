package com.qa.javaprograms;

public class StrigSpaces {
	public static void main(String[] args) {
		String s = " I m In dian";
		int c = 0;
		int ct = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '\s') {
				ct++;
			}
		}
		System.out.println(ct);

		for (char ch : s.toCharArray()) {
			if (ch == '\s') {
				c++;
			}
		}
		System.out.println(c);
	}
}