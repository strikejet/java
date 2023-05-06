package com.sunbeam;

import java.util.Iterator;

class LinkList {
	private static class Node {
		private int data;
		private Node next;
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	private class ListItr implements Iterator<Integer> {
		private Node cur;
		public ListItr() {
			cur = head;
		}
		@Override
		public boolean hasNext() {
			return cur != null;
		}
		@Override
		public Integer next() {
			Node temp = cur;
			cur = cur.next;
			return temp.data;
		}
	}
	
	private Node head;
	public LinkList() {
		head = null;
	}
	
	public void add(int val) {
		Node nn = new Node(val);
		if(head == null)
			head = nn;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = nn;
		}
	}
	
	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public Iterator<Integer> iterator() {
		return new ListItr();
	}
}

public class LinkedListMain {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		//list.display();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int ele = itr.next();
			System.out.println(ele);
		}
	}
}
