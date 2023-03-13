package com.collection.practice;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		System.out.println("Primitive Array before sorting:");
		for(int a1 : a) {
			System.out.println(a1);//10,5,20,11,6
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After sorting:");
		for(int a1 : a) {
			System.out.println(a1);//5,6,10,11,20
		}
		
		String[] s = {"A","Z","B"};
		System.out.println("Object Array before sorting:");
		for(String a2 : s) {
			System.out.println(a2);//A,Z,B
		}
		Arrays.sort(s);
		System.out.println("Object Array after sorting:");
		for(String a3 : s) {
			System.out.println(a3);//A,B,Z
		}
		Arrays.sort(s,new MyBook());
		System.out.println("Object array after sorting by comparator:");
		for(String a1 : s) {
			System.out.println(a1);//Z,B,A
					}
	}
}

     class MyBook implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			String s1=o1.toString();
			String s2=o2.toString();
			return s2.compareTo(s1);
		}
    	      }