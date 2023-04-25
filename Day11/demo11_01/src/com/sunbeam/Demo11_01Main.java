package com.sunbeam;

class Outer {
	// fields
	private int nonStaticField = 10;
	private static int staticField = 20;
	
	// methods ...
	
	static class Inner {
		// fields ...
		
		// methods
		public void displayInner() {
			//System.out.println("nonStaticField = " + nonStaticField); // error
			System.out.println("staticField = " + staticField); // 20
		}
	}
}


class Outer2 {
	// fields
	private int nonStaticField = 10;
	private static int staticField = 20;
	
	// methods ...
	
	static class Inner2 {
		// fields ...
		private static int staticField = 30;
		
		// methods
		public void displayInner2() {
			//System.out.println("nonStaticField = " + nonStaticField); // error
			System.out.println("Inner2.staticField = " + staticField); // 30
			System.out.println("Outer2.staticField = " + Outer2.staticField); // 20
		}
	}
}

class Outer3 {
	
	static class Inner3 {
		private int nonStaticField = 10;
		private static int staticField = 20;
		
		// private members of inner class are accessible in outer class directly (without getter/setter)
	}
	
	public void displayOuter3() {
		System.out.println("Inner3.staticField  = " + Inner3.staticField);
		Inner3 obj = new Inner3();
		System.out.println("Inner3.nonStaticField = " + obj.nonStaticField);
	}
}

public class Demo11_01Main {
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.displayInner();
		
		Outer2.Inner2 obj2 = new Outer2.Inner2();
		obj2.displayInner2();
		
		Outer3 obj3 = new Outer3();
		obj3.displayOuter3();
	}
}
