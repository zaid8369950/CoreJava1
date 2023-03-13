package com.collection.practice;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);
		//m.put("FF", "XX");  //CCE
	//	m.put(null, "XXX");  //NPE
		System.out.println(m);
	}
}
