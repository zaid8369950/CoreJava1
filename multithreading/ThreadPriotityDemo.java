package com.multithreading;
class Imran extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}
	}
}
public class ThreadPriotityDemo {
	public static void main(String[] args) {
		Imran i1 = new Imran();
		i1.setPriority(10);
		i1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}
	}

}
