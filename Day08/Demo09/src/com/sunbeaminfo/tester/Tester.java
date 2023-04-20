package com.sunbeaminfo.tester;

interface I1{
	void m1();
	void m2();
	void m3();
}

class C1 implements I1{
	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
	void m4() {
		System.out.println("m4");
	}
	
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class Tester {
	
	//This application is ment to crash
	public static void main(String[] args) {
		
		long arr[] = new long[999999999]; // OutOfMemoryError
		
		
	}

}
