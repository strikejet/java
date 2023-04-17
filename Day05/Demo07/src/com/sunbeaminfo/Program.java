package com.sunbeaminfo;

public class Program {

	//variable arity/argument method
	
	public static void add(int ... num1) {
		int result = 0;
		
		for(int i:num1)
			result = result+i;
		
		System.out.println("Addition = "+result);
	}

	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}

}
