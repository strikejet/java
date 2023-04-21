package com.sunbeaminfo.tester;

public class Tester {

	public static void main(String[] args) {
	
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		try {
		System.out.println(arr[6]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are accessing wrong index of the array");
			System.out.println("Displaying the value at index 0 - "+arr[0]);
		}
		
		
		System.out.println("Thankyou for using our Application");
		
	}

}
