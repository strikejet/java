package com.sunbeaminfo.tester;

//marker interface
interface Accecptable{
	
}

class Point implements Accecptable{
	private int x;
	private int y;
	
	void acceptPoint() {
		if(this instanceof Accecptable)
			System.out.println("Accept the data");
		else
			System.err.println("Accepting Not Allowed");
	}
}



public class Tester {

	public static void main(String[] args) {
		Point p = new Point();
		p.acceptPoint();

	}

}
