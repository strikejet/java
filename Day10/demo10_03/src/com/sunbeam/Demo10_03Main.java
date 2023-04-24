package com.sunbeam;

import java.util.ArrayList;
import java.util.Date;

class Box<TYPE> {
	private TYPE obj;
	public void set(TYPE obj) {
		this.obj = obj;
	}
	public TYPE get() {
		return this.obj;
	}
}

public class Demo10_03Main {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.set(new Integer(11));
		Integer r1 = b1.get();
		System.out.println("b1 contains : " + r1);
		
		Box<String> b2 = new Box<>(); // new Box<String>() -- here type is inferred
		b2.set(new String("Hello, DAC!"));
		String r2 = b2.get();
		System.out.println("b2 contains : " + r2);
		
		Box<Date> b3 = new Box<>();
		b3.set(new Date());
		//Double r3 = (Double) b3.get();	// compiler error -- cannot cast Date to Double
		Date r3 = b3.get();
		System.out.println("b3 contains : " + r3);
	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		//list.add("55"); // compiler error
		for (Integer ele : list) {
			System.out.println(ele);
		}
	}
}






