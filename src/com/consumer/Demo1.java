package com.consumer;

import java.util.function.Consumer;

public class Demo1 {

	
	public static void show(String s) {
		System.out.println("Hello"+s);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> s= Demo1:: show;
		s.accept("Now");
	}
}
