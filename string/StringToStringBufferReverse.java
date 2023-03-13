package com.string;

public class StringToStringBufferReverse {
public static void main(String[] args) {
	String s= "Zaid";
	StringBuffer sb = new StringBuffer();
	sb.append(s);
    sb =sb.reverse();
	System.out.println(sb);
}
}
