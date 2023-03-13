package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {

	public static void main(String[] args) {
		ReentrantLock i = new ReentrantLock();
		i.lock();
		i.lock();
		System.out.println(i.isLocked());
		System.out.println(i.isHeldByCurrentThread());
		System.out.println(i.getQueueLength());
		i.unlock();
		System.out.println(i.getHoldCount());
		System.out.println(i.isLocked());
		i.unlock();
		System.out.println(i.isLocked());
		System.out.println(i.isFair());
	}

	

}
