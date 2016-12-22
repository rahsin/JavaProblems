package com.java.algo;

public class LinkedList {
	Node head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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
		size++;
	}

	public void insertAt(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}

		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		size++;
	}

	public void append(int data) {
		Node new_node = new Node(data);

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}

		n.next = new_node;
		size++;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println("NULL");
	}

	public void delete(int data) {

		Node prev_node = null;
		Node n = head;

		if (n != null && n.data == data) {
			head = n.next;
			size--;
			return;
		}

		prev_node = n;

		while (n != null && n.data != data) {
			prev_node = n;
			n = n.next;
		}

		if(prev_node.next != null){
			prev_node.next = n.next;
			size--;
		}else{
			System.out.println("Key not found : " + data);
		}

		if (n == null){
			return;
		}
	}

	public void deleteAt(int index) {

		int count = 0;
		if (index < 0 || index > size) {
			System.out.println("Index not found");
			return;
		}

		Node n = head;
		Node prev_node = null;

		if (index == 0) {
			head = n.next;
			size--;
			return;
		}

		while (count != index) {
			prev_node = n;
			n = n.next;
			count++;
		}

		prev_node.next = n.next;
		size--;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(5);
		list.push(1);
		list.append(3);
		list.insertAt(list.head.next, 4);
		System.out.println(list.getSize());
		list.printList();
		list.delete(1);
		list.printList();
		System.out.println(list.getSize());
		list.deleteAt(1);
		list.printList();
		System.out.println(list.getSize());
	}

}
