package com.tnsif.lambdaexpression;
//collections
import java.util.ArrayList;

public class Lambdaexpr {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(3);
		li.add(7);
		li.add(2);
		li.add(6);
		li.forEach(ele->System.out.println(ele));
	}
}
