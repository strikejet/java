package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

// top-level class
class MyClass {
	public void display() {
		System.out.println("MyClass.display() called.");
	}
}

//top-level class
public class Demo11_04Main {
	public static void main(String[] args) {
		// inherit a class (OurClass) from MyClass and override display()
		class OurClass extends MyClass {
			@Override
			public void display() {
				System.out.println("OurClass.display() called.");
			}
		}
		// create object of inherited class.
		MyClass obj1 = new OurClass();
		// invoke display()
		obj1.display();
		System.out.println();
	
		// create a new class (Anonymous) inherited from MyClass and override its display() method.
		// also create a new object of the inherited class (using new keyword).
		MyClass obj2 = new MyClass() {
			private int nonStaticField = 10; // okay
			//private static int staticField = 20; // error
			@Override
			public void display() {
				System.out.println("Anonymous.display() called.");
			}
		};
		obj2.display();
		System.out.println();
		
		String[] arr = {"DAC", "DMC", "DESD", "DBDA", "DITISS"};
		// strDescComparator is object of a class (anon) inherited from Comparator<> interface
		Comparator<String> strDescComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int diff = -s1.compareTo(s2);
				return diff;
			}
		};
		Arrays.sort(arr, strDescComparator);
		for (String ele : arr)
			System.out.println(ele);
		System.out.println();
		
		// anonymous object of a class (anon) inherited from Comparator<> interface
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int diff = -s1.compareTo(s2);
				return diff;
			}
		});
		for (String ele : arr)
			System.out.println(ele);
	}
}







