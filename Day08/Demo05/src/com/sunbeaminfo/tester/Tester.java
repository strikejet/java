package com.sunbeaminfo.tester;

interface I1 {
	
}

interface I2 extends I1{
	
}

interface I3 extends I1,I2{
	
}

class C1 implements I1{
	
}

class C2 extends C1{
	
}

class C3 extends C1 implements I1,I2 {
	
}

public class Tester {

	public static void main(String[] args) {
		//I2 extends I1 // OK 
		//I2 implements I1 // NOT OK
		//I3 extends I1,I2 // OK
		//C1 extends I1 // NOT OK
		//C1 implements I1 // OK
		//C1 implements I1,I2 // OK		
		//C2 implements C1 //NOT OK
		//C2 extends C1 // OK
		//C3 extends C1,C2 // NOT OK
		//C3 extends C1 implements I1 // OK
		//C3 implements I1 extends C1 // NOT OK
		//class C3 extends C1 implements I1,I2 // OK
	}

}
