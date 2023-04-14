package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Complex;

public class Program {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		
		//c1.real = 10;
		c1.setReal(10);
	
		
		//c1.imag = 20;
		
		
		//System.out.println("Real = "+c1.real);
		
		//System.out.println("Imag = "+c1.imag);
		System.out.println("Imag = "+c1.getImag());
	}

}
