package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

//write a program to inserted stringbuffer object into the treeset where sorting order is alphabetical order
public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Sir());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("K"));
		System.out.println(t);
			}
}
class Sir implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =obj2.toString();
		return s1.compareTo(s2);
	}
}