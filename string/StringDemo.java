package com.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s= new String("zaid");
	    s.concat("siddiqui");
		System.out.println(s);

		StringBuffer sb = new StringBuffer("ZAID");
		sb.append("khan");
		System.out.println(sb);
	}

}
