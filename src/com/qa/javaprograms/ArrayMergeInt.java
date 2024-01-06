package com.qa.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMergeInt {
	public static void main(String[] args) {
		int A[] = { 1, -3, 0, 3 };
		int B[] = { 1, -99, 10000 };
		int len1 = A.length;
		int len2 = B.length;
		int size = len1 + len2;
		int C[] = new int[size];
		// System.out.println(Arrays.toString(C));
		System.arraycopy(A, 0, C, 0, len1);
		// System.out.println(Arrays.toString(C));
		System.arraycopy(B, 0, C, len1, len2);
		System.out.println(Arrays.toString(C));

		// array to arrayList
		ArrayList cList = new ArrayList();
		for (int e : C) {
			cList.add(e);
		}
		System.out.println(cList);
		for (int i = 0; i < cList.size(); i++) {
			for (int j = i + 1; j < cList.size(); j++) {
				if (cList.get(i) == cList.get(j)) {
					cList.remove(i);
				}
			}
		}
		System.out.println(cList);
	}
}