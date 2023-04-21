package com.sunbeaminfo.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array");
		int arr[];
		
		try {
			int size = new Scanner(System.in).nextInt();
			arr = new int[size];
		
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		
		}
		catch (InputMismatchException e) {
			System.out.println("Size is not an int value");
		}
		catch(Exception e) { //Genric catch block of all exceptions 
			e.printStackTrace();
			System.out.println("Something went wrong with array.");
		}
		
		
		System.out.println("Thankyou for using our Application");
		
	}

}
