package com.qa.javaprograms;

public class StringSwapping {

	public static void main(String[] args) {
		String s1 = "shahadat";
		String s2 = "khan";
		System.out.println("Before swap " + "s1:" + s1 + "  " + "s2:" + s2);

		int len1 = s1.length();// 5
		int len2 = s2.length();// 5

		s1 = s1 + s2;// h e l l o w o r l d
		s2 = s1.substring(0, len1);
		s1 = s1.substring(len1);
		System.out.println("After  swap " + "s1:" + s1 + "  " + "s2:" + s2);
	}

}
