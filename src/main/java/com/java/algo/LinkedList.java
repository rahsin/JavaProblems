package com.java.algo;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

	public void push(int data) {
		Node new_data = new Node(data);
		new_data.next = head;
		head = new_data;
	}

	public void insertAt(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}

		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void append(int data) {
		Node new_node = new Node(data);

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}

		n.next = new_node;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println("NULL");
	}
	
	public void delete(int data){
		
		Node prev_node = null ;
		Node n = head ;
		
		if(n != null && n.data == data){
			head = n.next ;
			return ;
		}
		
		
		while(n != null && n.data != data){
			prev_node = n ;
			n = n.next ;
		}
		
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.append(3);
		list.insertAt(list.head.next, 4);
		list.printList();
	}

}
