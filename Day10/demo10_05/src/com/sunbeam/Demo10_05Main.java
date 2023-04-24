package com.sunbeam;

import java.util.Date;

class Box<T> {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}

public class Demo10_05Main {
	/*
	public static void printIntegerBox(Box<Integer> b) {
		System.out.println("Integer Box contains: " + b.get());
	}
	public static void printStringBox(Box<String> b) {
		System.out.println("String Box contains: " + b.get());
	}
	*/
	
	/*
	// generic method -- T is generic type
	public static <T> void printGenericBox(Box<T> b) {
		System.out.println("Generic Box contains: " + b.get());
	}
	*/
	
	// unbounded parameter
	public static void printAnyBox(Box<?> b) {
		// internally "b" is any "Object".
		System.out.println("Generic Box contains: " + b.get());
	}
	
	// upper-bounded parameter
	public static void printNumberBox(Box<? extends Number> b) {
		// internally "b" is any "Number".
		System.out.println("Number Box contains: " + b.get());
	}
	
	// lower-bounded parameter
	public static void printSuperNumberBox(Box<? super Number> b) {
		// internally "b" is any "Object".
		System.out.println("Number Box contains: " + b.get());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.set(11);
		Box<String> b2 = new Box<>();
		b2.set("DAC");
		Box<Date> b3 = new Box<>();
		b3.set(new Date());
		Box<Number> b4 = new Box<>();
		b4.set(new Double(12.34));
		Box<Object> b5 = new Box<>();
		b5.set(new Object());
		
		printAnyBox(b1); // okay
		printAnyBox(b2); // okay
		printAnyBox(b3); // okay
		printAnyBox(b4); // okay
		printAnyBox(b5); // okay

		printNumberBox(b1); // okay: Integer extends Number
		//printNumberBox(b2); // error: String NOT extends Number
		//printNumberBox(b3); // error: Date NOT extends Number
		printNumberBox(b4); // okay: Number is Number
		//printNumberBox(b5); // okay: Object NOT extends Number
	
		//printSuperNumberBox(b1); // error: Integer NOT super class of Number
		//printSuperNumberBox(b2); // error: String NOT super class of Number
		//printSuperNumberBox(b3); // error: Date NOT super class of Number
		printSuperNumberBox(b4); // okay: Number is Number
		printSuperNumberBox(b5); // okay: Object is super class of Number
	}
}








