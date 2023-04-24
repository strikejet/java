package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private int std;
	private double marks;
	
	// Natural Ordering
	@Override
	public int compareTo(Student other) {
		int diff = this.roll - other.roll;
		return diff;
	}
	
	public Student() {
	}

	public Student(int roll, String name, int std, double marks) {
		this.roll = roll;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", marks=" + marks + "]";
	}
	
}

class StudStdComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		int diff = s1.getStd() - s2.getStd();
		return diff;
	}
}

public class Demo10_08Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "James", 5, 87.0);
		Student s2 = new Student(2, "Bill", 8, 65.0);
		if(s1.compareTo(s2) > 0)
			System.out.println("s1 is greater than s2");
		else
			System.out.println("s1 is smaller than s2"); // 1 - 2 = (-1) -- negative int
	
		Student[] arr = {
			new Student(5, "James", 5, 8.70),
			new Student(1, "Bill", 8, 8.20),
			new Student(2, "Steve", 5, 8.70),
			new Student(4, "Sundar", 8, 8.90),
			new Student(3, "Parag", 5, 8.30)
		};
		
		System.out.println("\nSort Students by Roll No (Natural Ordering): ");
		Arrays.sort(arr); // internally compare array elements with each other
			// using arr[i].compareTo(arr[j]) -- because Arrays.sort() relies on Comparable
			// standard of comparing objects.
		for (Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println("\nSort Students by Std: ");
		StudStdComparator stdComparator = new StudStdComparator();
		Arrays.sort(arr, stdComparator); // internally compare array elements with each other
		// using cmp.compare(arr[i],arr[j]) -- because Arrays.sort() relies on Comparator
		// standard of comparing objects (arg2 of sort() method)
		for (Student s : arr) {
			System.out.println(s);
		}
				
		System.out.println("\nSort Students by Marks: ");
		
		// local class
		/*
		class StudMarksComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff;
				if(s1.getMarks() == s2.getMarks())
					diff = 0;
				else if(s1.getMarks() > s2.getMarks())
					diff = +1;
				else //if(s1.getMarks() < s2.getMarks())
					diff = -1;
				return diff;
			}
		}
		*/
		
		/*
		class StudMarksComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff = (int)Math.signum(s1.getMarks() - s2.getMarks());
				return diff;
			}
		}
		*/
		
		class StudMarksComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff = Double.compare(s1.getMarks(), s2.getMarks());
				return diff;
			}
		}
		
		Arrays.sort(arr, new StudMarksComparator()); 
		for (Student s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println("\nSort Students by Name: ");
		
		class StudNameComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff = - s1.getName().compareTo(s2.getName()); 
				return diff;
			}
		}
		
		Arrays.sort(arr, new StudNameComparator()); 
		for (Student s : arr) {
			System.out.println(s);
		}		
	
		System.out.println("\nSort students by Std (Asc) and Marks (Desc) ");
		
		class StudStdMarksComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff = s1.getStd() - s2.getStd();
				if(diff == 0)
					diff = -Double.compare(s1.getMarks(), s2.getMarks());
				if(diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		
		Arrays.sort(arr, new StudStdMarksComparator()); 
		for (Student s : arr) {
			System.out.println(s);
		}
	}
}































