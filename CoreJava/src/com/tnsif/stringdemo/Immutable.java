package com.tnsif.stringdemo;

public class Immutable {
	public static void main(String[] args) {
		String str1="sachin";
		String str2=str1;
		String str3=str2;
		System.out.println("Before Modification");
		System.out.println("str1 "+str1);
		System.out.println("str2 "+str2);
		System.out.println("str3 "+str3);
		
		str1="tendulkar";
		System.out.println("After Modification");
		System.out.println("str1 "+str1);
		System.out.println("str2 "+str2);
		System.out.println("str3 "+str3);
	}

}
