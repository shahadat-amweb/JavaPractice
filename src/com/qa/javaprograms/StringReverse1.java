package com.qa.javaprograms;
public class StringReverse1 {
	public static void main(String[] args) {
		// abc def xyz --> cba fed zyx
		String s = "abc def xyz";
		System.out.println("Original string: " + s);
		stringReverse(s);
	}

	public static void stringReverse(String s) {
		String[] subStr = s.split(" ");
		int len = subStr.length;
		System.out.print("Reversed string: ");
		for (int i = 0; i < len; i++) {
			String sub = subStr[i];
			StringBuffer sb1 = new StringBuffer(sub);
			System.out.print(sb1.reverse() + " ");
		}
	}
}