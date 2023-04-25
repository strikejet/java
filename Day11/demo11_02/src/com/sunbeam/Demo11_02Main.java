package com.sunbeam;

class Outer {
	// fields
	private int nonStaticField = 10;
	private static int staticField = 20;
	// methods ...

	class Inner {
		// fields ...
		
		// methods
		public void displayInner() {
			System.out.println("nonStaticField = " + nonStaticField); // 10
			System.out.println("staticField = " + staticField); // 20
		}		
	}
}

class Outer2 {
	// fields
	private int nonStaticField = 10;
	private static int staticField = 20;
	// methods ...
	class Inner2 {
		// fields ...
		private int nonStaticField = 30;
		// methods
		public void displayInner2() {
			//"this" refer to Inner2 class object
			System.out.println("nonStaticField = " + nonStaticField); // 30
			System.out.println("staticField = " + staticField); // 20
			System.out.println("Outer2.nonStaticField = " + Outer2.this.nonStaticField); // 10
				// "Outer2.this" refer to Outer2 class object
		}		
	}
}

public class Demo11_02Main {
	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner ob = obj.new Inner(); 
			// Inner class object can only be created in context of outer class object
		ob.displayInner();
		System.out.println();
		
		Outer.Inner o = new Outer().new Inner();
			// new Outer() creates a new object of Outer class and 
			// in context of that object a new object of Inner class is created.
		o.displayInner();
		System.out.println();
		
		Outer2 obj2 = new Outer2();
		Outer2.Inner2 ob2 = obj2.new Inner2();
		ob2.displayInner2();
	}
}
