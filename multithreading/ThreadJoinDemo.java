package com.multithreading;

class Sohail extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("seetha thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Sohail s = new Sohail();
		s.start();
		s.join();
		for(int i=0;i<10;i++) {
			System.out.println("zaid thread");
		}

	}

}
