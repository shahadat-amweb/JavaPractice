package com.qa.javaprograms;

public class StringSpaces {

	/* Check and remove all spaces. */
	public static void main(String[] args) {
		// 1st approach
		String sentence = "I live in  Auanga Baad";
		sentence = sentence.replaceAll("\\s", "");
		System.out.println("Text after removing spaces: " + sentence);
		System.out.println();
		
		// 2nd approach
		String st = "I live in  Auanga Baad";
		String[] a = st.split(" ");
		for (String e : a) {
			System.out.print(e);
		}
		

	}

}
