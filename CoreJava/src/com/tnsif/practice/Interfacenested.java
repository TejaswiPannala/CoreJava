package com.tnsif.practice;

import com.tnsif.practice.Interfacenested;

	public class Interfacenested implements Myinterface.Myinnerinterface {

		public void print() {
			System.out.println("inner interface");
		}
		public static void main(String[] args) {
			Interfacenested n=new Interfacenested();
			n.print();
			System.out.println(Interfacenested.id);
		}

	}
