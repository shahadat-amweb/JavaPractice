package com.qa.javaprograms;

public class IStringSizeI {

	public static void main(String[] args) {
		String name = "shahadat"; // 8
		// char a[] = str.toCharArray();
		char[] nameAr = name.toCharArray();
		int i = 0;
		for (char c : nameAr) {

			i++;
		}
		System.out.println("length:" + i);
		System.out.println("length:" + name.toCharArray().length);
		System.out.println("length:" + name.lastIndexOf(""));
	}

}
