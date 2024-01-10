package com.qa.javacollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll.size());
		ll.add("v1");
		ll.add("v2");
		ll.add("v3");
		ll.add("v4");
		System.out.println(ll.size());

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		// reverse the linkedList
		Iterator<String> it1 = ll.descendingIterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//sort
		Collections.sort(ll);
		System.out.println(ll);

	}

}
