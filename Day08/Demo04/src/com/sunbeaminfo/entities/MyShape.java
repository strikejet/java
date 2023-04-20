package com.sunbeaminfo.entities;

public abstract class MyShape implements Shape {
	private int area;

	public void displayArea() {
		System.out.println("Area =" + this.area);
	}

}