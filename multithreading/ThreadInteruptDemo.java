package com.multithreading;

class Anus extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am Lazy Thread");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				System.out.println("I got Interrupted");
			}
		}
	}


public class ThreadInteruptDemo {

	public static void main(String[] args) {
		Anus a = new Anus();
		a.start();
		a.interrupt();
		System.out.println("End of the main Thread");

	}

}
