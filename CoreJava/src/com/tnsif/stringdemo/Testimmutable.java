package com.tnsif.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s="sachin";
		//s.cancat("tendulkar");
		System.out.println(s);
		s=s.concat("tendulkar");
		System.out.println(s);
	}

}
