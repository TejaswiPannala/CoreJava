package com.tnsif.synchronizeddemo;

public class Example {
	synchronized void display() {
		Thread q=Thread.currentThread();
		synchronized(this) {
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(q.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		}
	}
	}
}
