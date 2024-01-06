package com.qa.javaprograms;

import java.util.Arrays;
import java.util.List;

public class TestTest {
	/*
	 * Java Program to find the longest repeating sequence in a string i/p -
	 * acbdfghybdf o/p - bdf i/p - WebwwwWeb o/p - Web
	 */

	/*
	 * i/p: aabb12ccc o/p: String: a2b2c3 number: 12
	 * 
	 */
	public static void main(String[] args) {

		String str = "aabb12ccc";
		char[] strArray = str.toCharArray();
		int len = str.length();
		int count = 0;
		String number = "";

		List<String> strList = Arrays.asList(str);

		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i) == "12") {
				strList.remove(i);
			}
		}
		
		System.out.println(strList);
		
		for (int i = 0; i < len; i++) {

			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (strArray[i] == strArray[j]) {
					count++;
					strArray[j] = '0';
				}

			}

			if (strArray[i] != '0') {
				System.out.print(str.charAt(i) + "" + count);
			}
		}

	}

}
