package com.sunbeaminfo;

import java.util.Scanner;

enum Languages {
	EXIT,C, CPP, JAVA
}

public class Program {

	public static void main(String[] args) {
			int choice = 0;
			Scanner sc = new Scanner( System.in);
		do {
			System.out.println("0.EXIT");
			System.out.println("1.C");
			System.out.println("2.CPP");
			System.out.println("3.JAVA");
			System.out.print("Select language = ");
			choice = sc.nextInt();
			
			switch (Languages.values()[choice]) {
			case EXIT:
				System.out.println("Thankyou for using the app");
				break;
			case C:
				System.out.println("Selected Language is C");
				break;
			case CPP:
				System.out.println("Selected Language is CPP");	
				break;
			case JAVA:
				System.out.println("Selected Language is JAVA");
				break;

			default:
				System.out.println("Wrong input");
				break;
			}
			
			
		}while(choice!=0);
	}

}
