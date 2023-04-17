package com.sunbeaminfo;

enum Languages{
	C(10),CPP(11),JAVA(12),PYTHON(13);
	
	private int value;
	
	Languages(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}


public class Program {

	public static void main(String[] args) {
		Languages ln = Languages.CPP;
		System.out.println(ln.getValue());
	}

}
