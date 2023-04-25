package com.sunbeam;

import java.util.Date;

public class Demo11_03Main {
	private static int staticField = 10;
	private int nonStaticField = 20;
	
	public static void main(String[] args) {
		final int localVariable1 = 30; // final
		int localVariable2 = 40; // effectively final
		int localVariable3 = 50; // neither final nor effective final
		localVariable3++;
		
		// local class
		class Inner {
			public void displayInner() {
				System.out.println("staticField = " + staticField); // 10
				//System.out.println("nonStaticField = " + nonStaticField); // error
				System.out.println("final localVariable1 = " + localVariable1); // 30
				System.out.println("localVariable2 = " + localVariable2); // 40
				//System.out.println("localVariable3 = " + localVariable3); // error
			}
		}
		
		// objects of local class
		Inner obj1 = new Inner();
		obj1.displayInner();
		System.out.println();
		
		Inner obj2 = new Inner();
		
		new Inner().displayInner();
			// anonymous object of Inner class
		
		System.out.println(new Date().toString());
			// anonymous object of Date class
	
		//Arrays.sort(arr, new MyComparator());
			// anonymous object of MyComparator class
	}
}









