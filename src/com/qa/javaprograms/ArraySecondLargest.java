package com.qa.javaprograms;

import java.util.Arrays;

public class ArraySecondLargest {
	// there is no direct method to return the second/third.. largest element of
	// array.
	// the only way is we need to sort the array and retrieve the required element
	public static void main(String[] args) {
		int ar[] = { 1, 20, 13, 4, 50, 6 };
		System.out.println(Arrays.toString(ar));
		// Arrays.sort(ar);
		// System.out.println(Arrays.toString(ar));
		int len = ar.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ar[j] < ar[i]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[ar.length - 2]);
	}
}