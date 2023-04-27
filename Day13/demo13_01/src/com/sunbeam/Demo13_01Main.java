package com.sunbeam;

import java.util.Stack;

// LIFO
public class Demo13_01Main {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		while(!s.empty()) {
			Integer ele = s.pop();
			System.out.println("Popped: " + ele);
		}
 	}
}
