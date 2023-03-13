package com.multithreading;

class Display2{
	public synchronized void displayn() {
		for (int i = 1; i <=10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
		}
	}
	
	public synchronized void displayc() {
		for (int i = 65; i <=75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}

      class Adeeb extends Thread{
    	  Display2 d;

		public Adeeb(Display2 d) {
			this.d = d;
		}
		public void run(){
			d.displayn();
		}
	}
      
      class Sufiyan extends Thread{
    	  Display2 d;

		public Sufiyan(Display2 d) {
			this.d = d;
		}
		public void run(){
			d.displayc();
		}
	}
      
      
public class SynchronizedDemoMainExample {

	public static void main(String[] args) {
		Display2 d = new Display2();
        Adeeb a1 = new Adeeb(d);
        Sufiyan s1 = new Sufiyan(d);
        a1.start();
        s1.start();
	}

}
