package com.sunbeaminfo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// primitive types
		int arr[][] = new int[5][3];
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
		
		//Loops for putting the values inside array
		// rows
		for (int row = 0; row < arr.length; row++) {
			//cols
			for(int col = 0; col<arr[row].length;col++) {
				arr[row][col]= row+col; // Keep any logic for keeping the default values
			}
		}
		
		// Displaying the entire array
		//rows
		for(int row = 0; row<arr.length;row++) {
			//cols
			for(int col = 0; col<arr[row].length;col++) {
				System.out.println("arr["+row+"]["+col+"]="+arr[row][col]);
			}
		}
	}

}
