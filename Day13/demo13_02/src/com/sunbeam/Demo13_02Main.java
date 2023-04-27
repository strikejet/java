package com.sunbeam;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo13_02Main {
	public static void main(String[] args) {
		//Queue<Integer> q = new LinkedList<>(); // FIFO
		//Queue<Integer> q = new ArrayDeque<>(); // FIFO
		Queue<Integer> q = new PriorityQueue<>(); // Element with highest priority is popped first
		
		q.offer(30);
		q.offer(50);
		q.offer(10);
		q.offer(40);
		q.offer(20);
		
		Integer ele = q.peek();
		System.out.println("Next element to be popped: " + ele);
		System.out.println();
		
		while(!q.isEmpty()) {
			ele = q.poll();
			System.out.println("Popped: " + ele);
		}
	}
}
