package com.collection.practice;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet h = new HashSet();
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
