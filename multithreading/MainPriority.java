package com.multithreading;

class Zaid extends Thread{
	
}
public class MainPriority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(8);
         Zaid z = new Zaid();
         System.out.println(z.getPriority());
	}

}
