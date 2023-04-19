package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Square extends Shape {
	private int side;

	@Override
	public void acceptData() {
		System.out.print("Enter the side = ");
		this.side = new Scanner(System.in).nextInt();
	}

	@Override
	public void calculateArea() {
		this.setArea(this.side*this.side);
	}

}
