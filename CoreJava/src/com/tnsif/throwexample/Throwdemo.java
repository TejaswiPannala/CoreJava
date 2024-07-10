package com.tnsif.throwexample;
import java.io.IOException;

public class Throwdemo {
	static void display() throws IOException {
		throw new IOException();
	}
}
