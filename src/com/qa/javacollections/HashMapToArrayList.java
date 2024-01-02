package com.qa.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Amazon", "98");
		map1.put("Google", "78");
		map1.put("FB", "103");
		//Collections.sort(map1); not allowed
		
		List<String> keyList = new ArrayList<String>(map1.keySet());

		for (String e : keyList) {
			System.out.println(e);
		}

		List<String> keyValues = new ArrayList<String>(map1.values());

		for (String v : keyValues) {
			System.out.println(v);
		}

	}

}
