package com.sunbeam;

import java.util.function.BinaryOperator;

public class Demo12_01Main {
	public static void main(String[] args) {
		int num1 = 12, num2 = 4, num3 = 10;
		
		// output depends only on input -- pure functions
		// in java -- non-capturing lambda
		BinaryOperator<Integer> op1 = (x,y) -> x + y;
		Integer res1 = op1.apply(num1, num2);
		System.out.println("Result1: " + res1);
		
		// output depends on input + additional variables/factors
		// lambda expr also captures value of num3 (which is outside the lambda)
		// in java -- capturing lambda, in other fn languages -- closures
		BinaryOperator<Integer> op2 = (x,y) -> x + y + num3;
		Integer res2 = op2.apply(num1, num2);
		System.out.println("Result2: " + res2);
	}
}
