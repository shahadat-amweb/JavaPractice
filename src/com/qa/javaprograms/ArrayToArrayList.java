package com.qa.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
//		String str1[] = { "A", "E", "I" }; // source array
//		String str2[] = { "O", "U" }; // destination array
//		
//		List<String> list1 = new ArrayList<String>(Arrays.asList(str1)); 
//		List<String> list2 = new ArrayList<String>(Arrays.asList(str2));
//		// returns a list view of an array
//		// returns a list view of str2 and adds all elements of str2 into list

//		list1.addAll(list2);
//		System.out.println(list1);
//		Object[] str3 = list1.toArray(); // converting list to array
//		System.out.println(Arrays.toString(str3)); // prints the resultant array

		int A[] = { 1, -3, 0, 3 };
		int B[] = { 1, -99, 10000 };
		int len1 = A.length;
		int len2 = B.length;
		int size = len1 + len2;
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		for (int i = 0; i < len1; i++) {
			list1.add(A[i]);
		}
		System.out.println(list1);

		for (int j = 0; j < len2; j++) {
			list2.add(B[j]);
		}

		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
	}
}
