package com.qa.javaprograms;

import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println(millis);
		System.out.println(date);
	}
}
