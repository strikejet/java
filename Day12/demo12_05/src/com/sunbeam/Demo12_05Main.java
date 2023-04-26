package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo12_05Main {
	public static void main(String[] args) {
		/*
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		list1.add(55);
		// fail-fast iterator
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Integer ele = itr1.next();
			System.out.println(ele);
			if(ele == 33) {
				list1.add(66);
				//list1.remove(4); // index=4
			}
 		}
 		*/

		List<Integer> list2 = new CopyOnWriteArrayList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		// fail-safe iterator
		System.out.println("Traversing list --");
		Iterator<Integer> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			Integer ele = itr2.next();
			System.out.println(ele);
			if(ele == 33) {
				list2.add(66);
				//list2.remove(4); // index=4
			}
 		}
		// changes done in the collection, will be visible when new itr is created.
		System.out.println("Traversing list again --");
		itr2 = list2.iterator();
		while(itr2.hasNext()) {
			Integer ele = itr2.next();
			System.out.println(ele);
			if(ele == 33) {
				list2.add(66);
				//list2.remove(4); // index=4
			}
 		}

	}
}
