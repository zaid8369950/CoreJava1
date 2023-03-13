package com.collection.practice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("C");
		h.add("D");
		h.add("E");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
		
	}

}
