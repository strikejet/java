package com.sunbeaminfo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][]; // Ragged Array
		arr[0] = new int[4];
		arr[1] = new int[6];
		arr[2] = new int[3];
		arr[3] = new int[8];
		arr[4] = new int[2];

		
		System.out.println("Ragged Array");
		
		// Loops for putting the values inside array
		// rows
		for (int row = 0; row < arr.length; row++) {
			// cols
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = row + col; // Keep any logic for keeping the default values
			}
		}

		// Displaying the entire array
		// rows
		for (int row = 0; row < arr.length; row++) {
			// cols
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("arr[" + row + "][" + col + "]=" + arr[row][col]);
			}
		}

	}

}
