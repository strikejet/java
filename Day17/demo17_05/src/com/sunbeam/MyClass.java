package com.sunbeam;

@Developer(value="Nilesh") // company is default "Sunbeam"
public class MyClass {
	
	@Developer(value="Rahul", company="SIPL") // company is given "SIPL"
	private int field1;
	
	@Developer(value="Amit", company="Sunbeam")
	private int field2;
	
	//@Developer(value="Amit", company="Sunbeam") // error
	public MyClass() {

	}
	
	@Developer(value="Rahul", company="SIPL")
	public void method1() {
		
	}
	
	@Developer(value="Amit", company="Sunbeam")
	public void method2(int arg1, int arg2) {
		
	}
}
