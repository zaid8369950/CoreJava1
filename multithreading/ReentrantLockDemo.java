package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Screen{
	ReentrantLock l = new ReentrantLock();
	public  void wish(String name) {
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Morning:");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {}
				System.out.println(name);
		}
		l.unlock();
	}
}

class Rizwan1 extends Thread{
	Screen d;
	String name;
	public Rizwan1(Screen d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
}
public class ReentrantLockDemo {

	public static void main(String[] args) {
		Screen s = new Screen();
		Rizwan1 t1 = new Rizwan1(s,"dhoni");
		Rizwan1 t2 = new Rizwan1(s,"yuvraj");
		Rizwan1 t3 = new Rizwan1(s,"virat");
		t1.start();
		t2.start();
		t3.start();
	}

}
