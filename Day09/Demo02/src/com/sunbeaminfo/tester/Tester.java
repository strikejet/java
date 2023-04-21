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
		
		}catch (NegativeArraySizeException e) {
			System.out.println("You have entered a negative value");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size should be equalto or greater than 5");
		}
		catch (InputMismatchException e) {
			System.out.println("Size is not an int value");
		}
		
		
		System.out.println("Thankyou for using our Application");
		
	}

}
