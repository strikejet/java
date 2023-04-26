package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo12_02Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(22);
		list.add(11);
		list.add(33);
		list.sort(Integer::compare);
			// compare() is static method in Integer class -- with same signature as SAM
			// fn intf Comparator -- compare(x,y) --> Integer.compare(x,y)
		//list.sort((x,y) -> Integer.compare(x, y));

		list.forEach(System.out::println);
			// println() is non-static method on OutputStream class "System.out" object.
			// fn intf Consumer -- accept(e) --> System.out.prinltn(e);
		//list.forEach(ele -> System.out.println(ele));
		
		String[] arr = {"DAC", "DMC", "DESD"};
		Arrays.sort(arr, String::compareTo);
			// compareTo() is non-static method in String class -- with 2 args (this, other)
			// fn intf Comparator -- compare(x,y) --> x.compareTo(y) -- x is this and y is other
		//Arrays.sort(arr, (x,y) -> x.compareTo(y));
		System.out.println(Arrays.toString(arr));
	}
}
