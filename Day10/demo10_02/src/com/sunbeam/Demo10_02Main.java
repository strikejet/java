package com.sunbeam;

import java.util.ArrayList;

public class Demo10_02Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add("55");
		for (Object ele : list) {
			Integer i = (Integer) ele; // ClassCastException "55" --> Integer not possible
			System.out.println(i);
		}
	}
}
