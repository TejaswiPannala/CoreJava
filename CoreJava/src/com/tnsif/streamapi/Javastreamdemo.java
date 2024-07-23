package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
	public static void main(String[] args) {
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"hp",300000));
		pl.add(new Product(2,"lenovo",400000));
		pl.add(new Product(3,"dell",250000));
//		List<Float> pl2=pl.stream().filter(p->p.price>30000)//filtering data
//				.map(p->p.price)
//				.collect(Collectors.toList());
//		System.out.println(pl2);
		
		
		//using collectors method for sum of the prices
//		double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
//		System.out.println(totalprice);
		//
		
		//find max and min
		Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:0).get();
		System.out.println(p);
		
	}
}
