package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo13_06Main {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		Collections.addAll(set, 33, 88, 11, 99, 33, 55, 77, 22, 44, 55);
			// duplicate elements are not added e.g. 33, 55
		System.out.println("Size: " + set.size());	
		System.out.println("Set: " + set);
		
		// SortedSet<> methods
		System.out.println("first Ele: " + set.first()); // 11
		System.out.println("last Ele: " + set.last()); // 99
		System.out.println("headSet(40): " + set.headSet(40)); // 11, 22, 33
		System.out.println("tailSet(70): " + set.tailSet(70)); // 77, 88, 99
		System.out.println("subSet(40,70): " + set.subSet(40,70)); // 44, 55
	
		// NavigableSet<> methods
		System.out.println("floor(40): " + set.floor(40));
		System.out.println("ceiling(40): " + set.ceiling(40));
		
		System.out.println("Traverse using Descending Iterator: ");
		Iterator<Integer> ditr = set.descendingIterator();
		while(ditr.hasNext()) {
			Integer ele = ditr.next();
			System.out.print(ele + ", ");
		}
		System.out.println();
		System.out.println("Original Set: " + set);
		
		NavigableSet<Integer> dset = set.descendingSet();
		System.out.println("Descending Set: " + dset);
	
		System.out.println("Original Set: " + set);
	}
}



