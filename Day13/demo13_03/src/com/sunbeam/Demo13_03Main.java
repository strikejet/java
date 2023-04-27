package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo13_03Main {
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>(); // Natural Ordering
		q1.offer(30);
		q1.offer(50);
		q1.offer(10);
		q1.offer(40);
		q1.offer(20);
		while(!q1.isEmpty()) {
			Integer ele = q1.poll();
			System.out.println("Popped: " + ele);
		}
		System.out.println();
		
		Queue<Integer> q2 = new PriorityQueue<>((x,y) -> y - x); // Comparator
		q2.offer(30);
		q2.offer(50);
		q2.offer(10);
		q2.offer(40);
		q2.offer(20);
		while(!q2.isEmpty()) {
			Integer ele = q2.poll();
			System.out.println("Popped: " + ele);
		}
	}
}
