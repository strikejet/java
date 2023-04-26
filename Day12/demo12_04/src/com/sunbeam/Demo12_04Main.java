package com.sunbeam;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12_04Main {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		
		System.out.println("Initial capacity: " + list.capacity());
		System.out.println("Initial size: " + list.size());
		
		for(int i=1; i<=10; i++)
			list.add(i);
		
		System.out.println("After adding 10: capacity: " + list.capacity());
		System.out.println("After adding 10: size: " + list.size());
		
		list.add(11);
		
		System.out.println("After adding 11: capacity: " + list.capacity());
		System.out.println("After adding 11: size: " + list.size());
		
		// Enumeration is older (1.0 and 1.1) way of traversing Vector.
		Enumeration<Integer> en = list.elements();
		while(en.hasMoreElements()) {
			Integer ele = en.nextElement();
			System.out.println(ele);
		}
	}
}
