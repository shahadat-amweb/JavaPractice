package com.qa.javaprograms;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		String s3 = "Hi";
		String s4 = "Hi";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);

	}
}