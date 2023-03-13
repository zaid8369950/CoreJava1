package com.multithreading;

class Display1{
	public static synchronized void wish(String name) {
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

class Irfan extends Thread{
	Display1  d;
	String name;
	public Irfan(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		Irfan i1= new Irfan(d1,"Dhoni");
		Irfan i2= new Irfan(d2,"Zaid");
        i1.start();
        i2.start();
	}

}
