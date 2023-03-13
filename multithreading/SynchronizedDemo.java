package com.multithreading;

class Display{
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Morning:");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {}
				System.out.println(name);
		}
	}
}

class Rizwan extends Thread{
	Display1 d;
	String name;
	public Rizwan(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		Display1 d = new Display1();
		Rizwan r1 = new Rizwan(d,"Dhoni");
		Rizwan r2 = new Rizwan(d,"Yuvraj");
		Rizwan r3 = new Rizwan(d,"Sachin");
		Rizwan r4 = new Rizwan(d,"Malinga");
		r1.start();
		r2.start();
		r3.start();
		r4.start();
	}

}
