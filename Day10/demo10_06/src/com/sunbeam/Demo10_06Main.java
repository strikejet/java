package com.sunbeam;

public class Demo10_06Main {
	/*
	// before java 5.0 -- generic using java.lang.Object
	public static void swap(Object a, Object b) {
		Object t = a;
		a = b;
		b = t;
		System.out.println("a = " + a + ", b = " + b);
	}
	*/
	
	// from java 5.0 onwards -- generic using <T>
	public static <T> void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("a = " + a + ", b = " + b);
	}
	
	// generic method to display array elements
	public static <T> void printArray(T[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element " + i + " = " + arr[i]);
	}
	
	// generic method to display number array elements
	public static <T extends Number> void printNumberArray(T[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println("Number Element " + i + " = " + arr[i]);
	}
	
	public static void main(String[] args) {
		String s1 = "DAC", s2 = "DESD";
		swap(s1, s2); // T is String -- generic type inferred from arg types
		Integer i1 = 100, i2 = 200;
		swap(i1, i2); // T is Integer -- generic type inferred from arg types
		Integer d1 = 123;
		Double d2 = 12.3;
		swap(d1, d2); // T is Number -- generic type inferred from arg types
		
		// classname.methodname() -- static methods
		//Demo10_06Main.<Integer>swap(d1, d2); // T is Integer -- manual typing -- compiler error d2 is not Integer
		Demo10_06Main.<Number>swap(d1, d2); // T is Number -- manual typing
		
		String[] stringArray = { "DAC", "DMC", "DESD", "DBDA", "DITISS" };
		printArray(stringArray);
		Double[] doubleArray = { 3.4, 6.7, 3.1, 5.3, 9.2 };
		printArray(doubleArray);
		
		//printNumberArray(stringArray); // error: String NOT extends Number
		printNumberArray(doubleArray); // okay: Double extends Number
	}

}










