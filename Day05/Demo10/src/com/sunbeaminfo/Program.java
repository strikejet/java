package com.sunbeaminfo;

public class Program {

	public static void main(String[] args) {
		String name = "sunbeam"; // literal pool
		String name1 = "sunbeam";
		
		String name2 = new String("sunbeam");//object
		String name3 = new String("sunbeam");
		
		String name4 = "sun"+"beam"; // name4 will be literal
		String name5 = "sun".concat("beam"); // name5 will be object
		
		String name6 = "sun";
		String name7 = "beam";
		
		String name8 = name6 + name7; // name8 will be object
		String name9 = name6 + "beam"; // name9 will be object
		
		String name10 = (name6.concat("beam")).intern(); // convert the object into literal
		
		if(name==name10)
				System.out.println("Equal");
		else
				System.out.println("Not Equal");
	}

}
