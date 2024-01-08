package com.qa.javaprograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
//		Anagrams mean if two Strings have the same characters but in a different order.
//		For example: Angel and Angle are anagrams

		String s1 = "Angel";
		String s2 = "Angle";

		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();

		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);

		
		System.out.println(Arrays.equals(s1Arr, s2Arr));
		//System.out.println(s1Arr.equals(s2Arr));
		
		
		if (Arrays.equals(s1Arr, s2Arr)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}

	}

}
