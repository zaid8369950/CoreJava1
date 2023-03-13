package com.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Fahim extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	Fahim(String name){
		super(name);
	}
	
	
	public void run() {
		do {
			try {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+"...got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"...releases lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+"...unable to get lock and will try again");
				}
			}
			catch (Exception e) {}
		}
		while (true);
	}
	}


public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		Fahim t1 = new Fahim("First Thread");
		Fahim t2 = new Fahim("Second Thread");
		t1.start();
		t2.start();
	}

}
