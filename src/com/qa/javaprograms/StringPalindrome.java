package com.qa.javaprograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		/*
		 * A palindrome is a word, phrase, number, or other sequence of symbols or
		 * elements that reads the same forward or reversed. For example: 12121 is
		 * palindrome as it reads same forward or reversed. madam is also a palindrome .
		 */
		// 1st Approach

		String str = "radar"; // level

//		  String reverseStr = "";
//		  
//		  for (int i = str.length() - 1; i >= 0; i--) { 
//		  reverseStr = reverseStr + str.charAt(i); 
//		  } 
//		  if (str.equals(reverseStr)) { 
//		  System.out.println("String is palindrome"); }
//		  else { System.out.println("String is not palindrome"); }
//		 

		// 2nd Approach
		StringBuilder strBuilder = new StringBuilder(str);

		strBuilder.reverse();

		if (str.equals(strBuilder.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
