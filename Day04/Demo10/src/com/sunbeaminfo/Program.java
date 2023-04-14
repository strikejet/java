package com.sunbeaminfo;

import java.util.Arrays;


public class Program {

	public static void main(String[] args) {
		
		int arr[] = {20,50,10,70,30,60,50};

		System.out.println("Before :"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After :"+Arrays.toString(arr));
		
		//System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
		
		int arr2[] = new int[-2]; //NegativeArraySizeException
	}

}
