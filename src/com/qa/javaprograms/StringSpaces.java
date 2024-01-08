package com.qa.javaprograms;

public class StringSpaces {

	public static void main(String[] args) {
		String sentence = "I live in  Auanga Baad";
		/* Check and remove all spaces. */
		sentence = sentence.replaceAll("\\s", "");
		System.out.println("Text after removing spaces: " + sentence);

	}

}
