package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo18_02Main {
	public static void main(String[] args) {
		Stream.iterate(1, i -> i + 1)
			.limit(5)
			.forEach(i -> System.out.println(i));
		System.out.println();
		
		int sum = Stream.iterate(1, i -> i + 1)
			.limit(5)
			.reduce(0, (a,i) -> a + i);
		System.out.println("Sum: " + sum);
		
		int res = IntStream.rangeClosed(1, 5).sum();
		System.out.println("Sum: " + res);

		int fact = Stream.iterate(1, i -> i + 1)
				.limit(5)
				.reduce(1, (a,i) -> a * i);
		System.out.println("\nFactorial: " + fact);
		System.out.println();
		
		
		Stream.generate(() -> Math.random())
			.limit(5)
			.forEach(d -> System.out.println(d));
		System.out.println();
			
		Random r = new Random();
		Stream.generate(() -> r.nextInt(100))
			.limit(5)
			.forEach(i -> System.out.println(i));
		System.out.println();
		
		Integer[] arr = { 88, 33, 11, 99, 44, 55 };
		Optional<Integer> res1 = Stream.of(arr)
			.max((x,y) -> x - y);
		if(res1.isPresent())
			System.out.println("Max : " + res1.get());
		else
			System.out.println("No Max Found.");
		
		Optional<Integer> res2 = Stream.of(arr)
				.max((x,y) -> x - y);
		System.out.println("Max : " + res2.orElse(0));
		
		Optional<Integer> res3 = Stream.of(arr)
				.max((x,y) -> x - y);
		res3.ifPresent(i -> System.out.println("Max : " + i));
		System.out.println();
		
		IntSummaryStatistics stat = IntStream.of(88, 33, 11, 99, 44, 55)
			.summaryStatistics();
		System.out.println(stat.toString());
	}
	
}















