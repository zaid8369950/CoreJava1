package com.multithreading;

class MyZaid extends Thread{
	MyZaid(ThreadGroup g,String name){
		super(g,name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
		}
	}
}


public class ThreadGroupDemo  {

	public static void main(String[] args) throws Exception {
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		MyZaid t1 = new MyZaid(pg,"ChildThread1");
		MyZaid t2 = new MyZaid(pg,"ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}

}
