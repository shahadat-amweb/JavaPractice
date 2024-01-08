package com.qa.javacollections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();

		map.put(1000, "A");
		map.put(1200, "B");
		map.put(3000, "C");
		map.put(1800, "D");
		System.out.println(map.get(1800));
	

	}

}
