package com.multithreading;

public class ThreadLocalDemo1 {

	
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal()//;
		{
			public Object initialValue(){
				return "xyz";
			}
		};
		
		System.out.println(tl.get());
		tl.set("zaid");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}
}
