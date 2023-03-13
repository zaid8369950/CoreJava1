package com.multithreading;

class John extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
		}
	}
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		John j = new John();
        j.setDaemon(true);
        j.start();
        System.out.println("End of main thread");
	}

}
