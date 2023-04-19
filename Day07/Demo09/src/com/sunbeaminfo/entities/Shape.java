package com.sunbeaminfo.entities;

public abstract class Shape {
	private double area;
	
	public Shape() {
	
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void acceptData();
	public abstract void calculateArea();
	
	public void displayArea() {
		System.out.println("Area = "+this.area);
	}
	
}
