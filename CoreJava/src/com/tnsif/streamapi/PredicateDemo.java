package com.tnsif.streamapi;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);  //creating predicate
		System.out.println(pr.test(7));
	}

}
