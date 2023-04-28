package com.sunbeam;

import java.util.stream.Stream;

public class Demo18_01Main {
	public static void main(String[] args) {
		Integer[] arr = {3, 5, 9, 2, 1, 6, 4, 7, 6};
		// industrial practice/coding convention
		Stream<Integer> strm = Stream.of(arr);
		strm
			.map(i -> i * i)
			.filter(i -> i % 2 != 0)
			.sorted((x,y) -> y - x)
			.map(i -> "DAC"+i)
			.forEach(i -> System.out.println(i));
		System.out.println();
				
		// understanding stream code
		Stream<Integer> strm1 = Stream.of(arr);
		Stream<Integer> strm2 = strm1.map(i -> i * i);
		Stream<Integer> strm3 = strm2.filter(i -> i % 2 != 0);
		Stream<Integer> strm4 = strm3.sorted((x,y) -> y - x);
		Stream<String> strm5 = strm4.map(i -> "DAC"+i);
		strm5.forEach(i -> System.out.println(i));
		System.out.println();
		
		// understanding how streams are executed/processed internally
		Stream<Integer> stream = Stream.of(arr);
		stream
			.map(i -> {
				System.out.println("map() -- square -- " + i);
				return i * i;
			})
			.filter(i -> {
				System.out.println("filter() -- " + i);
				return i % 2 != 0;
			})
			.sorted((x,y) -> {
				System.out.println("compare() -- " + x + " and " + y);
				return y - x;
			})
			.map(i -> {
				System.out.println("map() -- DAC + " + i);
				return "DAC" + i;
			})
			.forEach(i -> System.out.println("forEach() -- " + i));
	}
}







