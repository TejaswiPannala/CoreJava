package com.tnsif.multithreadinddemo;

public class Implementingrunnable implements Runnable {
	
	public static void main(String[] args) {
		Implementingrunnable e=new Implementingrunnable();
		//e.start();
		Thread t1=new Thread();
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Implementing runnable interface");
		
	}

}
