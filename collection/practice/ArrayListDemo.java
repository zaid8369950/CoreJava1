package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
	//	l.add(new Integer(10));//cce
	//	l.add(null);//NPE
		System.out.println("Before Sorting: "+l);
		Collections.sort(l,new myzai());
		System.out.println("After Sorting: "+l);
	}
}
class myzai implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 =(String)o1;
		String s2 =o2.toString();
		return s2.compareTo(s1);
	}
	
}
