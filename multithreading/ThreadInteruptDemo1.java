package com.multithreading;

class Faheem extends Thread{
	public void run() {
		for(int i=0;i<=10000;i++) {
			System.out.println("I am Lazy Thread-"+i);
		}
		System.out.println("I am Entering into Sleeping state");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("I got Interupted");
		}
	}
}
public class ThreadInteruptDemo1 {

	public static void main(String[] args) {
		Faheem f = new Faheem();
		f.start();
		f.interrupt();
		System.out.println("End Of Main Thread");

	}

}
