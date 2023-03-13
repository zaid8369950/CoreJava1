package com.multithreading;

public class DaemonSmallExample extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		DaemonSmallExample d = new DaemonSmallExample();
		System.out.println(d.isDaemon());
		d.setDaemon(true);
		System.out.println(d.isDaemon());
	}

}
