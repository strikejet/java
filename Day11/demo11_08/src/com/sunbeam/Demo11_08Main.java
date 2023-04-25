package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Demo11_08Main {
	public static void main(String[] args) {
		Emp[] arr = new Emp[] {
			new Emp(4, "Bill", "Manager", "Acc", 40000.0),
			new Emp(8, "John", "Clerk", "Sales", 35000.0),
			new Emp(2, "Millar", "Salesman", "Sales", 32000.0),
			new Emp(3, "Steve", "Manager", "Sales", 65000.0),
			new Emp(9, "King", "Manager", "Research", 62000.0),
			new Emp(7, "James", "Clerk", "Research", 62000.0)
		};
		
		System.out.println("Emps Sorted by Name Asc: ");
		// local class
		class EmpNameComparator implements Comparator<Emp> {
			@Override
			public int compare(Emp e1, Emp e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		}
		Arrays.sort(arr, new EmpNameComparator());
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();
		
		System.out.println("Emps Sorted by Dept Asc: ");
		// anonymous class
		Comparator<Emp> deptComparator = new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				int diff = e1.getDept().compareTo(e2.getDept());
				return diff;
			}
		};
		Arrays.sort(arr, deptComparator);
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();
		
		System.out.println("Emps Sorted by Job Asc: ");
		Arrays.sort(arr, new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				int diff = e1.getJob().compareTo(e2.getJob());
				return diff;
			}
		});
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();
		
		System.out.println("Emps Sorted by Empno Desc: ");
		// multi-line lambda expr
		Arrays.sort(arr, (Emp e1, Emp e2) -> {
			int diff = e1.getId() - e2.getId();
			return -diff;
		});
		
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();

		System.out.println("Emps Sorted by Name Desc: ");
		// multi-line lambda expr -- arg types are inferred
		Arrays.sort(arr, (e1, e2) -> {
			int diff = e1.getName().compareTo(e2.getName());
			return -diff;
		});
	
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();

		System.out.println("Emps Sorted by Dept Desc: ");
		// multi-line lambda expr -- with curly braces
		Arrays.sort(arr, (e1,e2) -> {
			return -e1.getDept().compareTo(e2.getDept());
		});
		
		for (Emp e : arr)
			System.out.println(e);
		System.out.println();

		System.out.println("Emps Sorted by Job Desc: ");
		// single liner lambda expr
		Arrays.sort(arr, (e1,e2) -> -e1.getJob().compareTo(e2.getJob()));

		for (Emp e : arr)
			System.out.println(e);
		System.out.println();
	}
}






