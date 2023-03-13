package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{

	String name;
	
	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+"...Job Started by Thread:"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
		}
		System.out.println(name+"...Job Completed by Thread:"+Thread.currentThread().getName());
	}
	
}

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs= { new PrintJob("zaid"),
				           new PrintJob("imran"),
				           new PrintJob("muzammil"),
				           new PrintJob("anis"),
				           new PrintJob("waliullah"),
				           new PrintJob("rizwan") };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs) {
			service.submit(job);
		}
		    service.shutdown();

	}

}
