package com.sunbeaminfo;

public class Program {

	public static void main(String[] args) {
		String name = "sunbeam"; // literal pool
		String name1 = new String("sunbeam"); // new object will be created 
		String name2 = "pune"; // literal pool
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
	}

}
