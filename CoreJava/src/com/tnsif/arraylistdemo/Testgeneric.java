package com.tnsif.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgeneric {
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("teju");
		a1.add("vrindha");
		a1.add("riya");
		
		//a1.add(8);
		System.out.println("elements "+a1);
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
}
