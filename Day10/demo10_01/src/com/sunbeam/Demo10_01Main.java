package com.sunbeam;

import java.util.Date;

class Box {
	private Object obj;
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return this.obj;
	}
}

public class Demo10_01Main {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.set(new Integer(11));
		Integer r1 = (Integer) b1.get();
		System.out.println("b1 contains : " + r1);
		
		Box b2 = new Box();
		b2.set(new String("Hello, DAC!"));
		String r2 = (String) b2.get();
		System.out.println("b2 contains : " + r2);
		
		Box b3 = new Box();
		b3.set(new Date());
		Double r3 = (Double) b3.get();	// runtime -- ClassCastException
		System.out.println("b3 contains : " + r3);
	}
}






