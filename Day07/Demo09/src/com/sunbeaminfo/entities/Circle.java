package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Circle extends Shape {
	private int radius;

	@Override
	public void acceptData() {
		System.out.print("Enter the radius = ");
		this.radius = new Scanner(System.in).nextInt();
	}

	@Override
	public void calculateArea() {
	this.setArea(3.14*this.radius*this.radius);

	}

}
