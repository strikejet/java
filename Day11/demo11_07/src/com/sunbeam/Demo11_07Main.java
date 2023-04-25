package com.sunbeam;


interface Displayable {
	default void show() {
		System.out.println("Displayable.show() called.");
	}
}

interface Printable {
	default void show() {
		System.out.println("Printable.show() called.");
	}
}

// compiler error: duplicate default method show()
//class FirstClass implements Displayable, Printable {
//}

class SecondClass implements Displayable, Printable {
	@Override // override show of Displayable and Printable 
	public void show() {
		System.out.println("SecondClass.show() called.");
	}
}

class ThirdClass implements Displayable {
	// show() is NOT overridden
}

class FourthClass implements Displayable {
	@Override // override show of Displayable 
	public void show() {
		System.out.println("FourthClass.show() called.");
		Displayable.super.show();
	}
}

class MyClass {
	public void show() {
		System.out.println("MyClass.show() called.");
	}
}


class FifthClass extends MyClass implements Displayable {

}

public class Demo11_07Main {
	public static void main(String[] args) {
		SecondClass obj2 = new SecondClass();
		obj2.show();
		System.out.println();
	
		ThirdClass obj3 = new ThirdClass();
		obj3.show();
		System.out.println();
		
		FourthClass obj4 = new FourthClass();
		obj4.show();
		System.out.println();
		
		FifthClass obj5 = new FifthClass();
		obj5.show();
	}
}
