package com.sunbeam;

class Box<T extends Number> {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
	public double value() {
		return this.obj.doubleValue(); 
		// can invoke any method from Number class on T obj.
	}
}

public class Demo10_04Main {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(); // okay: Integer extends Number
		//Box<String> b2 = new Box<>(); // error: String NOT extends Number
	}

}
