package com.qa.javacollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		//synchronized map
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "A");
		map1.put("2", "B");
		map1.put("3", "C");
		Map<String, String> map2 = Collections.synchronizedMap(map1);
		System.out.println(map1);

		//Concurrent Map
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("1", "A");
		concurrentMap.put("2", "B");
		concurrentMap.put("3", "C");
	
		System.out.println(concurrentMap.get("1"));

	}

}
