package com.qa.javaprograms;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		// A = [1, -3, 0, 3]
		// B = [1, -99, 10000]
		int A[] = { 1, -3, 0, 3 };
		int B[] = { 1, -99, 10000 };
		int size = A.length + B.length;
		// System.out.println(size);
		int C[] = new int[size];
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
//		for (int i = 0; i < A.length; i++) {
//			C[i] = A[i];
//		}
//		for (int i = 0; i < B.length; i++) {
//			C[A.length + i] = B[i];
//		}
//		for (int i = 0; i < size; i++) {
//			System.out.print(C[i] + " ,");
//		}
		// System.out.println(Arrays.toString(C));
		int pos = 0;
		for (int e : A) {
			C[pos] = e;
			pos++;
		}
		for (int e : B) {
			C[pos] = e;
			pos++;
		}
		System.out.println(Arrays.toString(C));
	}
}