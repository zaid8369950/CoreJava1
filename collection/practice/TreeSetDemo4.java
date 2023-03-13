package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

//write a program to insert string and stringbuffer object into treeset where sorting order is incresing length order
//if two object having same length then consider there alphabetical order
public class TreeSetDemo4 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Raza());
		t.add("I");
		t.add("D");
		t.add(new StringBuffer("ABCD"));
		t.add(new StringBuffer("ZRKS"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("B"));
		t.add("LBW");
		t.add("AA");
		t.add("I");
		System.out.println(t);
	}
}
class Raza implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 < l2)
			return -1;
		else if(l1 > l2)
			return +1;
		else
			return s1.compareTo(s2);
}
}