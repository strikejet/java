package com.sunbeaminfo;

public class Program {

	public static void main(String[] args) {
		String name = "sunbeam"; // literal pool
		String name1 = new String("sunbeam");//object
		
		StringBuffer buffer1 = new StringBuffer("sunbeam");
		StringBuffer buffer2 = new StringBuffer("sunbeam");
		
		StringBuilder builder1 = new StringBuilder("sunbeam");
		StringBuilder builder2 = new StringBuilder("sunbeam");
		
		if(builder1.equals(builder2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
			
	}

}
