package com.sunbeaminfo.entity;

public class Complex {
	private int real;
	private int imag;
	
	//settter
	public void setReal(int real) {
		this.real = real;
	}
	
	//getter
	public int getImag(){
		return this.imag;
	}

	public int getReal() {
		return real;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	void display(int real) {
		this.real = 50;
		System.out.println(this.imag);
	}
	
}
