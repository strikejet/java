package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Circle implements Shape {
	private int radius;
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr radius = ");
		this.radius =  sc.nextInt();
		
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle = "+(3.14*this.radius*this.radius));
	}

}
