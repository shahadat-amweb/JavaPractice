package com.qa.javaprograms;

public class StringRev {

	public static void main(String[] args) {
		String s = "shahadat";// 8
		// 1st approach
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		// 2nd approach
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
