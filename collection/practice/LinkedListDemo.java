package com.collection.practice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("zaid");
		l.add(30);
		l.add(null);
		l.add("zaid");
		l.set(0, "software");
		l.add(0,"venky");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);
		
		
	}
}
