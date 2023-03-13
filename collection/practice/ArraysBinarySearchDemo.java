package com.collection.practice;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysBinarySearchDemo {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));//1
		System.out.println(Arrays.binarySearch(a, 14));//-5
		
		String[] s = {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(binarySearch(s,"Z"));//2
		System.out.println(binarySearch(s,"S"));//-3
		
		Arrays.sort(s,new MyReport());
		System.out.println(binarySearch(s,"Z",new MyReport()));//0
		System.out.println(binarySearch(s,"S",new MyReport()));//-2
		System.out.println(binarySearch(s,"N"));//unpredictable result
				}
}
    class MyReport implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			String s1=o1.toString();
			String s2=o2.toString();
			return s2.compareTo(s1);
		}
    	
    }
