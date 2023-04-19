package com.sunbeaminfo.tester;

import java.util.Scanner;

import com.sunbeaminfo.entity.Employee;
import com.sunbeaminfo.entity.Person;
import com.sunbeaminfo.entity.Student;

public class Tester {

	public static void main(String[] args) {
		// Person p = new Person();
		/*
		 * Person p = new Employee("rohan","pune",1,1000); //upcasting p.displayData();
		 * 
		 * p = new Student("pratik","karad",2,70);//upcasting p.displayData();
		 */

		Person parr[] = new Person[5];
		int choice;
		Person p = null;
		int index = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0.EXIT");
			System.out.println("1.Add Person");
			System.out.println("2.Add Employee");
			System.out.println("3.Add Student");
			System.out.println("4.Dispaly all objects");
			System.out.print("Enter the choice = ");

			choice = sc.nextInt();

			switch (choice) {
				case 0:
					System.out.println("Thank you for using our app");
					break;
				case 1:
					p = new Person();
					break;
				case 2:
					p = new Employee();
					break;
				case 3:
					p = new Student();
					break;
				case 4:
					for (Person person : parr)
						person.displayData();
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}

			if (index < 5 && p != null) {
				p.acceptData();
				parr[index] = p;
				index++;
				p = null;
			}

		} while (choice != 0);

	}

}
