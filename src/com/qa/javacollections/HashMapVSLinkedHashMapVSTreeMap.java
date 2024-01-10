package com.qa.javacollections;

import java.util.TreeMap;

public class HashMapVSLinkedHashMapVSTreeMap {

	public static void main(String[] args) {
//		HashMap<String, String> capitalMap = new HashMap<String, String>();
//		LinkedHashMap<String, String> capitalMap = new LinkedHashMap<String, String>();
	TreeMap<String, String> capitalMap = new TreeMap<String, String>();

		capitalMap.put("Angola", "Luanda");
		capitalMap.put("Argentina", "Buenos");
		capitalMap.put("Armenia", "Yerevan");
		capitalMap.put("India", "New Delhi");
		System.out.println(capitalMap);

	}

}
