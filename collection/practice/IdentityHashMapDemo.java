package com.collection.practice;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1, "mannan");
		m.put(i2, "aryan");
		System.out.println(m);//but in hashmap only one
		

	}

}
