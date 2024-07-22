package com.tnsif.practice;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(("Enter the number "));
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("the number is 0");
		} else {
			System.out.println("not zero");
		}
	}

}
