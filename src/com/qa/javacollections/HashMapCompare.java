package com.qa.javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		// 1.on the basis of key-value:equals method
		System.out.println(map1.equals(map2));

		// 2.for the same keys:keySet()
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map2.keySet().equals(map3.keySet()));

		// 3.find out the extra keys
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");

		System.out.println(map1);

		System.out.println(map4);
		// 1st approach
		HashSet<Integer> keys1 = new HashSet(map1.keySet());
		HashSet<Integer> keys4 = new HashSet(map4.keySet());
		System.out.println(keys1.removeAll(keys4));
		System.out.println(keys1);

		System.out.println("-----------------");
		// 2nd approach
		// combine the keys from the maps : using HashSet
		HashSet<Integer> combinedKeys = new HashSet<Integer>(map1.keySet());
		System.out.println(combinedKeys);
		combinedKeys.addAll(map4.keySet());
		System.out.println(combinedKeys);
		combinedKeys.removeAll(map4.keySet());
		System.out.println(combinedKeys);
		System.out.println(combinedKeys);

		// compare maps by values
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(2, "B");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "B");

		// duplicates are not allowed
		System.out.println("-----------------");
		System.out.println(new ArrayList(map5.values()).equals(new ArrayList(map6.values())));//true
		System.out.println(new ArrayList(map5.values()).equals(new ArrayList(map7.values())));//false

		// duplicates are allowed
		System.out.println(new HashSet(map5.values()).equals(new HashSet(map6.values())));//true
		System.out.println(new HashSet(map5.values()).equals(new HashSet(map7.values())));//true

	}
}
