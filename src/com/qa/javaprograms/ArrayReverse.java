package com.qa.javaprograms;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] a = { 7, 8, 9, 3, 4, 6, 11, 67, 98 };
		System.out.println(Arrays.toString(a));

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}