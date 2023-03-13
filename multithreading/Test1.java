package com.multithreading;

class MyThread3 extends Thread{
	public void run() {
		System.out.println("run method executed by Thread:"
				+ Thread.currentThread().getName());
		
	}
}


public class Test1 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("main method executed by Thread:"
				+ Thread.currentThread().getName());
		
	}

}
