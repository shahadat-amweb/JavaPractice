package com.qa.javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class IStringReverseI {

	public static void main(String[] args) {
		String str = "abc xyz";
		System.out.println(str.lastIndexOf(""));
		// cba zyx

		String strAr[] = str.split(" ");
		String first = strAr[0];
		String second = strAr[1];
		for (int i = first.length() - 1; i >= 0; i--) {
			char c = first.charAt(i);
			System.out.print(c);
		}

		System.out.print(" ");
		for (int i = second.length() - 1; i >= 0; i--) {
			char c = second.charAt(i);
			System.out.print(c);

		}
	}
}
