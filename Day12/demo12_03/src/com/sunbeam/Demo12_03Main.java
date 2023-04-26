package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo12_03Main {
	public static void main(String[] args) {
		//List<String> list = new Vector<>();
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("DAC");
		list.add("DMC");
		list.add("DESD");
		list.add("DBDA");
		list.add("DITISS");
		list.add("DAC");	// duplicates are allowed
		
		if(list.isEmpty())
			System.out.println("List is Empty");
		else
			System.out.println("List is Not Empty");
		
		System.out.println("\nSize: " + list.size());
		
		System.out.println("\ntoString: " + list.toString());
		
		System.out.println("\nTraversal using for-each loop: ");
		for(String ele: list)
			System.out.println(ele);
		
		System.out.println("\nTraversal using Iterator: ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
				// next() returns current element and takes itr to the next element
			System.out.println(ele);
		}
		
		// to traverse back iteration should begin from the end of the list,
		// so that first call to previous() will return last element.
		// listIterator() takes index as argument for initial position of iterator
		System.out.println("\nRev Traversal using ListIterator: ");
		ListIterator<String> litr = list.listIterator(list.size());
		while(litr.hasPrevious()) {
			String ele = litr.previous();
				// previous() takes itr to prev element and then return it.
			System.out.println(ele);
		}
		
		System.out.println("\nTraversal using forEach() method: ");
		list.forEach(ele -> System.out.println(ele));
		System.out.println();
		
		// random access
		int index = 3;
		String ele = list.get(index);
		System.out.println("Element at Index " + index + " is " + ele);
		
		list.set(index, "PG-DBDA");
		System.out.println("\nAfter set(): " + list);
		
		list.remove(index);
		System.out.println("\nAfter remove(index): " + list);
		
		list.add(index, "DACA");
		System.out.println("\nAfter add(index,obj): " + list);
		System.out.println();
		
		// searching
		String key = "DESD";
		if(list.contains(key))
			System.out.println(key + " is in list");
		else
			System.out.println(key + " is not in list");
		
		index = list.indexOf(key);
		System.out.println(key + " found at index " + index);
		
		index = list.lastIndexOf(key);
		System.out.println(key + " found at index " + index);

		list.remove(key);
		// delete first matching element from list
	
		System.out.println("\nAfter Delete: " + list);
		
		
		list.removeIf(e -> e.length() > 3);
		System.out.println("\nAfter removeIf(): " + list);
	
		list.clear();
		// delete all
		System.out.println("\nAfter Clear: Size = " + list.size());
	}
}









