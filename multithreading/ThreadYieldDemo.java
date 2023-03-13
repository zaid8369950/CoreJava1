package com.multithreading;
class Wali extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class ThreadYieldDemo {

	public static void main(String[] args) {
		Wali w = new Wali();
		w.start();
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
			}

	}

}
