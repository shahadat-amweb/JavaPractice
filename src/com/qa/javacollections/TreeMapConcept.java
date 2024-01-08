package com.qa.javacollections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(1000, "A");
		map.put(1200, "B");
		map.put(3000, "C");
		map.put(1800, "D");
		System.out.println(map);
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());

		map.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));

		// reverse order
		System.out.println("Reverse order");
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		map1.put(1000, "A");
		map1.put(1200, "B");
		map1.put(3000, "C");
		map1.put(1800, "D");

		map1.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));

	}

}
