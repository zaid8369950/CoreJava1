package com.string;

final class OwnImmutableClass {

	private int i;
	OwnImmutableClass(int i){
		this.i=i;
	}
	
	public OwnImmutableClass modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new OwnImmutableClass(i);
		}
	}
	public static void main(String[] args) {
		OwnImmutableClass o1= new OwnImmutableClass(10);
		OwnImmutableClass o2= o1.modify(100);
		OwnImmutableClass o3= o1.modify(10);
		System.out.println(o1==o2);
		System.out.println(o1==o3);
	}
}
