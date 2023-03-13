package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

//write a program to insert string object into the treeset where all elements should be inserted according to
//reverse of alphabetical order
public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Zaid());
		t.add("Imran");
		t.add("Zaid");
		t.add("Muzammil");
		t.add("Fazal");
		t.add("Talha");
		System.out.println(t);
		

	}
}

class Zaid implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =(String)obj2;
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);
	}
	
}
