package com.collection.practice;

public class Test {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));//return -ve iff obj1 has to come before obj2
		System.out.println("K".compareTo("A"));//return +ve iff obj1 has to come after obj2
		System.out.println("A".compareTo("A"));//return 0 iff obj1 and obj2 are equal

	}

}
