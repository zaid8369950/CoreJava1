package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

class Comp{
	public static void main(String[] args) {
		Employee e1 = new Employee("irfan",456);
		Employee e2 = new Employee("zaid",234);
		Employee e3 = new Employee("chiru",565);
		Employee e4 = new Employee("rahul",345);
		Employee e5 = new Employee("nag",134);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1 = new TreeSet(new zComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

	
}

class zComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		
	}
	
}
