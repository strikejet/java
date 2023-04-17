package com.sunbeaminfo;

public class Program {

	public static void main(String[] args) {
		String name = "sunbeam"; // literal pool
		String name1 = "sunbeam";
		String name2 = new String("sunbeam");
		String name3 = new String("sunbeam");
		
		if(name2 == name3)
				System.out.println("Equal");
		else
				System.out.println("Not Equal");
	}

}
