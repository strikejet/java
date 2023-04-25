package com.sunbeam;

interface Displayable {
	void show();
}

interface Printable {
	void show();
}

class MyClass implements Displayable, Printable {
	@Override // override show of Displayable and Printable 
	public void show() {
		System.out.println("MyClass.show() called.");
	}
}

public class Demo11_05Main {
	public static void main(String[] args) {
		Printable obj1 = new MyClass();
		obj1.show();
		Displayable obj2 = new MyClass();
		obj2.show();
	}
}
