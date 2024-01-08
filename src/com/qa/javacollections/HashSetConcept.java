package com.qa.javacollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("C");
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs);

	}

}
