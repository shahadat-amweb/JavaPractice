package com.qa.javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("Angola", "Luanda");
		capitalMap.put("Argentina", "Buenos");
		capitalMap.put("Armenia", "Yerevan");

		// System.out.println(capitalMap.containsKey("India"));
//		System.out.println(capitalMap.keySet());
//		System.out.println(capitalMap.values());
		capitalMap.put("abc", null);
		capitalMap.put(null, null);
		capitalMap.put(null, "thevi");
		capitalMap.put(null, null);
		System.out.println(capitalMap);
		System.out.println(capitalMap.size());

		System.out.println("----------------------");
		// Iterator over the keys: by using keyset()
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(capitalMap.get(key));
		}

		System.out.println("----------------------");
		// Iterator over the set (pair): by using entrySet()
		Iterator<Entry<String, String>> itt = capitalMap.entrySet().iterator();
		while (itt.hasNext()) {
			Entry<String, String> entry = itt.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("----------------------");
		// Iterate hash map using lambda
		capitalMap.forEach((k,v)-> System.out.println(k));
		
		

	}

}
