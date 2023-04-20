package com.sunbeaminfo.tester;

//Marker Interface
interface I1{
	
}

//Why to use it?
//To provide extra info or MetaData to the JVM



class Complex implements Cloneable {
	int real;
	int imag;
	
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	
}


public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Complex c1 = new Complex(10, 20);
		System.out.println("c1 = "+c1);
		
		Complex c2 = (Complex)c1.clone();
		
		System.out.println("c2 = "+c2);
		c2.real = 50;
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		
	}

}
