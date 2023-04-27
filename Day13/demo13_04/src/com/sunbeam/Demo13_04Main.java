package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Demo13_04Main {
	public static void main(String[] args) {
		//Deque<Integer> dq = new ArrayDeque<>();
		Deque<Integer> dq = new LinkedList<>();
		
		// Deque as Queue (FIFO)
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		while(!dq.isEmpty()) {
			Integer ele = dq.pollFirst();
			System.out.println("Queue Popped: " + ele);
		}
		System.out.println();

		// Deque as Stack (LIFO)
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerFirst(30);
		dq.offerFirst(40);
		while(!dq.isEmpty()) {
			Integer ele = dq.pollFirst();
			System.out.println("Stack Popped: " + ele);
		}
	}
}