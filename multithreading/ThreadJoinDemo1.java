package com.multithreading;

class Waliullah extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
			}
		catch(InterruptedException e) {
			
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}
public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Waliullah.mt = Thread.currentThread();
		Waliullah w = new Waliullah();
        w.start();
      
        for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
			Thread.sleep(2000);
		}
	}

}
