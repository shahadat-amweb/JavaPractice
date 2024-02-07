package com.qa.javaprograms;

public class StringSwapping {

	public static void main(String[] args) {
		String name = "shahadat";
		String sname = "khan";
		System.out.println("Before swap " + "name:" + name + "  " + "s2:" + sname);

		int len1 = name.length();// 5
		int len2 = sname.length();// 5

		name = name + sname;// shahadatkhan
		sname = name.substring(0, len1);
		name = name.substring(len1);
		System.out.println("After  swap " + "name:" + name + "  " + "sname:" + sname);
	}

}
