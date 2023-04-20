package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Complex implements Serviceable{
	private int real;
	private int imag;
	
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real = ");
		this.real = sc.nextInt();
		
		System.out.print("Enter imag = ");
		this.imag = sc.nextInt();
	}
	@Override
	public void printData() {
		System.out.println("Real = "+this.real);
		System.out.println("Imag= "+this.imag);
		
	}

	
}
