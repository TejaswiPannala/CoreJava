package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		//user defined or custom class
		ArrayList<Student> s=new ArrayList<Student>();
		//s1.add("fgtjh");
		Student s1=new Student(104,"teju","AIML");
		Student s2=new Student(101,"vrindha","CS");
		Student s3=new Student(103,"aadhya","CSE");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println("Before sorting"+s);
		Collections.sort(s);
		System.out.println("After sorting"+s);
		
	}
}
