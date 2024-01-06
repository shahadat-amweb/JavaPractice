package com.qa.javaprograms;

import java.util.Arrays;

public class ArrayCopy {
	/*
	 * arraycopy(Object src, int srcPos,Object dest, int destPos, int length) Here,
	 * src - source array you want to copy srcPos - starting position (index) in the
	 * source array dest - destination array where elements will be copied from the
	 * source destPos - starting position (index) in the destination array length -
	 * number of elements to copy
	 * 
	 */
	public static void main(String[] args) {
		int A[] = { 1, -3, 0, 3 };
		int B[] = { 1, -99, 10 };
		int len1 = A.length;
		int len2 = B.length;
		int size = len1 + len2;
		int C[] = new int[size];
		// System.out.println(Arrays.toString(C));
		System.arraycopy(A, 0, C, 0, len1);
		// System.out.println(Arrays.toString(C));
		System.arraycopy(B, 0, C, len1, len2);
		System.out.println(Arrays.toString(C));

		for (int e:C) {
			System.out.print(e + ",");
		}

	}
}