package com.multithreading;

public class DemoForMyThread1 {
 public static void main(String[] args) {
	MyThread1 t = new MyThread1();
	t.start();
	System.out.println("main method");
}
}
