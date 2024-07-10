package com.tnsif.throwexample;
import java.util.Scanner;
public class Testdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the roll number ");
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("rollno cannot be negative");
		}
		else {
			System.out.println("valid rollno");
		}
	}
}
