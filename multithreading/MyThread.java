package com.multithreading;

public class MyThread extends Thread{
	public void run() {
		System.out.println("no-arg run");
	}
    public void run(int i) {
    	System.out.println("int-arg run");
    }
}
