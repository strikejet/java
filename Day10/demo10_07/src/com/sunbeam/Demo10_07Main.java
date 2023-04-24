package com.sunbeam;

import java.util.ArrayList;

class A {
	public void print(ArrayList<Integer> list) {
		// ...
	}
}

class B extends A {
	@Override // overriding is possible -- same generic type
	public void print(ArrayList<Integer> list) {
		// ...
	}
	/*
	@Override // compiler error -- not typesafe to override with different type
	public void print(ArrayList<String> list) {
		// ...
	}
	*/
}

public class Demo10_07Main {

	public static void main(String[] args) {

	}

}
