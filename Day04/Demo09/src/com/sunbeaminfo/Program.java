package com.sunbeaminfo;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		//way 2
		//int arr[] = new int[] {10,20,30,40,50};

		//way3
		int arr[] = {10,20,30,40,50,60,70};

		//array reference
		int arr1[];
		int [] arr2;
		
		System.out.println("using for loop");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	
		System.out.println("using for each");
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println("using Arrays toString method");
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
