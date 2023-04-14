package com.sunbeaminfo;

public class Program {

	public static void main(String[] args) {
		//way 1
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

//		System.out.println("Using print statements");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		System.out.println("using for loop");
		for (int i = 0; i < 5; i++)
			System.out.println(arr[i]);
	}

}
