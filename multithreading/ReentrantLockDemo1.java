package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Faheem1 extends Thread{
	static ReentrantLock l = new ReentrantLock();
	
	Faheem1(String name){
		super(name);
	}
	
	public void run() {
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"...got lock and performing save operations");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
					}
			l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+"...unable to get lock and hence performing alternative operations");
		}
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Faheem1 t1 = new Faheem1("First Thread");
		Faheem1 t2 = new Faheem1("Second Thread");
		t1.start();
		t2.start();
	}

}
