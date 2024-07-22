package com.tnsif.stringdemo;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("welcome");
		b.append(" "+" to Java");
		System.out.println(b);
		b.insert(0, "hi ");
		System.out.println(b);
		b.delete(0, 5);
		System.out.println(b);
	}
}
