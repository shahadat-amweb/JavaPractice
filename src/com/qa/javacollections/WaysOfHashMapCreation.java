package com.qa.javacollections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysOfHashMapCreation {

	public static HashMap<String, Integer> MarksMap;
	static {
		MarksMap = new HashMap<String, Integer>();
		MarksMap.put("Eng", 86);
		MarksMap.put("Phy", 89);
		MarksMap.put("Chem", 89);
	}

	public static void main(String[] args) {
		// using HashMap class
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();

		// 2. Static way : static hashMap:
		System.out.println(WaysOfHashMapCreation.MarksMap.get("Eng"));

		// 3.Immutable Map with only single entry
		Map<String, Integer> map3 = Collections.singletonMap("per", 95);
		// map3.put("avg", 80);//UnsupportedOperationException

		// 4. JDK 8 :
		// Creating one 2D array of strings using stream and collecting in the form of
		// Map
		Map<String, String> map4 = Stream.of(new String[][] { { "shaan", "A++" }, { "Zidan", "A+++" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("shaan"));
		map4.put("zabu", "A++++");

		// USING simple entry:Immutable map
		Map<String, String> map5 = Stream
				.of(new AbstractMap.SimpleImmutableEntry<>("shaan", "Java"),
						new AbstractMap.SimpleImmutableEntry<>("Ayesha", "C"),
						new AbstractMap.SimpleImmutableEntry<>("Fatima", "C++"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map5.get("Fatima"));

		// USING simple entry:mutable map
		Map<String, String> map6 = Stream.of(new AbstractMap.SimpleImmutableEntry<>("shaan", "Java"),
				new AbstractMap.SimpleEntry<>("Usman", "Ruqayya"), new AbstractMap.SimpleEntry<>("Abubakar", "Fatima"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map6.get("Usman"));

		// JDK 1.9
		// empty map
		Map<String, String> emptyMap = Map.of();
		// emptyMap.put("lang", "Python");
//		System.out.println(emptyMap.get("lang"));//UnsupportedOperationException

		// signleton map
		Map<String, String> singletonMap = Map.of("k1", "v1");
		System.out.println(singletonMap.get("k1"));
		// singletonMap.put("lang", "Python");//UnsupportedOperationException

		// multi values map : max 10 key-pairs can be added
		Map<String, String> multiMap = Map.of("k11", "v11", "k12", "v12", "k13", "v13", "k14", "v14", "k15", "v15",
				"k16", "v16", "k17", "v17", "k18", "v18", "k19", "v19", "k20", "v20");
		System.out.println(multiMap.get("k11"));

	}

}
