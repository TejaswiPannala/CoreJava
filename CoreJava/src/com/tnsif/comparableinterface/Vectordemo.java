package com.tnsif.comparableinterface;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("size of vector "+v.size());
		v.add("red");
		v.add("blue");
		v.add("orange");
		v.add("black");
		int capacity=v.capacity();
		System.out.println(capacity);
		v.add(3,"pink");
		System.out.println(v);
		
	}

}
