package com.multithreading;


class MyThread2 extends Thread{
	
}
public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread2 t = new MyThread2();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());
//		System.out.println(10/0);

	}

}
