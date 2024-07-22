package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("r");
		l.add(2);
		l.add("hg");
		l.add(0.9);
		System.out.println("After Invoking add() "+l);
		l.add(1, "apple");
		System.out.println(l);
		LinkedList l1=new LinkedList();
		l1.add(11);
		l1.add("ds");
		l1.add(0.6);
		l1.add(l);
		l1.addFirst("d");
		l1.addLast(34);
		l1.remove(0);
		System.out.println(l1);
	}

}
