package com.multithreading;

public class ThreadA {
   public static void main(String[] args) throws InterruptedException {
	ThreadB b = new ThreadB();
	b.start();
	synchronized (b) {
		System.out.println("Main thread calling wait method");
		b.wait();
		System.out.println("Main thread got notification");
		System.out.println(b.total);
	}
}
}

class ThreadB extends Thread{
      int total = 0;
      public void run() {
    	  	synchronized (this) {
				System.out.println("Child thread starts calculation");
				for (int i = 1; i <=100; i++) {
					total=total+i;
				}
				System.out.println("Child Thread giving notification");
				this.notify();
			}
      }
	
	
}