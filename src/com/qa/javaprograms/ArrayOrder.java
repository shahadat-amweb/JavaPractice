package com.qa.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayOrder {

	public static void main(String[] args) {
		// 1st approach
		Integer arr[] = { 12, 0, 133, -4, 43, 3, 10 };

		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		// arrList.add(12);
		System.out.println(arrList);
		Collections.sort(arrList);
		System.out.println(arrList);
		Collections.reverse(arrList);
		System.out.println(arrList);
		System.out.println("----------------------------");

		// 2nd Approach
		// Ascending order
		int arr1[] = { 12, 0, 133, -4, 43, 3, 10 };
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		// sorts array[] in descending order
		Integer arr2[] = { 12, 0, 133, -4, 43, 3, 10 };
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(arr2));

		// 3rd Approach
		int ar[] = { 12, 1, 70, 7, 17 };
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		int len = ar.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ar[j] < ar[i]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		System.out.println("Asscending: " + Arrays.toString(ar));

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ar[j] > ar[i]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		System.out.println("Descending: " + Arrays.toString(ar));
	}
}