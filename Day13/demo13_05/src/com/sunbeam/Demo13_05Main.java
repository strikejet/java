package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo13_05Main {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new TreeSet<>((x,y) -> x.compareToIgnoreCase(y));
		
		set.add("dac");	// add a new element and return true
		set.add("dmc"); // add a new element and return true
		set.add("desd"); // add a new element and return true
		set.add("Dbda"); // add a new element and return true
		set.add("Ditiss"); // add a new element and return true
		set.add("desd"); // if duplicate element it is NOT added and return false
		
		System.out.println("Size: " + set.size());
		System.out.println("toString: " + set.toString());
	
		System.out.println("\nTraverse Set using for each loop: ");
		for(String ele: set)
			System.out.println(ele);
		
		System.out.println("\nTraverse Set using Iterator: ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		
		System.out.println("\nTraverse Set using forEach() method: ");
		set.forEach(ele -> System.out.println(ele));
	}
}
