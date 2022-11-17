package com.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void show(String s) {
		System.out.println("Heloo  " +s);
	}
	
	
	public static void main(String[] args) {
		
		//consumer
		Consumer<String> c= Demo::show;
		c.accept("Shubhame");
		
		//function
		Function<Integer,Integer> f=a -> a+a;
		System.out.println(f.apply(4));
		
		//Predicate
		Predicate<String> p= s->s.length()==4;
		System.out.println(p.test("Piya"));
		
		//Suplier
		Supplier<Integer> i=()->Math.addExact(3, 6);
		System.out.println(i.get());
		
	}
}

