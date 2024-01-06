package com.qa.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMaxMin {

	public static void main(String[] args) {
		/*
		 * int arr[] = { 1, 423, 6, 46, 6, 34, 23, 13, 53, 4 };
		 * 
		 * // Implemented inbuilt function to sort array 
		 * Arrays.sort(arr);
		 * 
		 * //after sorting the value at 0th position will minimum and // nth position
		 * will be maximum System.out.println("min-" + arr[0] + " max-" +
		 * arr[arr.length- 1]);
		 * }
		 */
		// Array iteration
		int items[] = { 1, 423, 6, 46, 34, 23, 13, 53, 4 };
		int max, min;
		max = items[0];
		min = items[0];

		for (int i = 1; i < items.length; i++) {
			if (items[i] > max) {
				max = items[i];
			} else if (items[i] < min) {
				min = items[i];
			}
		}
		System.out.println("max: " + max); // 100
		System.out.println("min: " + min);

	}
}