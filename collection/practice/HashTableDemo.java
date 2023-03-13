package com.collection.practice;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable(25);
		h.put(new Zemp(5), "A");
		h.put(new Zemp(2), "B");
		h.put(new Zemp(6), "C");
		h.put(new Zemp(15), "D");
		h.put(new Zemp(23), "E");
		h.put(new Zemp(16), "F");
		System.out.println(h);
			}
}
class Zemp{
	int i;
	Zemp(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}