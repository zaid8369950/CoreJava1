package com.collection.practice;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("Z");
		t.add("a");
		t.add("A");
		t.add("B");
		t.add("L");
		//t.add(null);//--NPE
		//t.add(new Integer(10));//CCE
		System.out.println(t);
		
		
	}

}
