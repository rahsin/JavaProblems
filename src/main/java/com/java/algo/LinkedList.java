package com.java.algo;

public class LinkedList {

	 Node head;
	private int size = 0;

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

		if (prev_node.next != null) {
			prev_node.next = n.next;
			size--;
		} else {
			System.out.println("Key not found : " + data);
		}

		if (n == null) {
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

	

	public int getSize() {
		
		Node n = head ;
		int count = 0 ;
		while(n != null){
			n = n.next;
			count++;
		}
		return count;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void swapData(int x , int y){
		Node x1 = head;
		Node y1  = head;
		boolean hasX = false ;
		boolean hasY = false ;
		
		
		while(x1 != null && x1.data != x){
			x1 = x1.next;
		}
		
		if(x1 != null){
			hasX = true ;
		}
		
		while(y1 != null && y1.data != y){
			y1 = y1.next;
		}
		
		if(y1 != null){
			hasY = true ;
		}
		
		if(hasX && hasY){
			x1.data = y ;
			y1.data =x ;
		}else{
			System.out.println("Swapping data not in the list");
		}
	}
	
	Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	public static void main(String[] args) {
		/*LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(5);
		list.push(6);
		list.append(3);
		list.insertAt(list.head.next, 4);
		System.out.println(list.getSize());
		
		list.printList();
		list.swapData(4, 1);
		list.printList();*/
		/*list.delete(1);
		list.printList();
		System.out.println(list.getSize());
		
		list.deleteAt(1);
		list.printList();
		System.out.println(list.getSize());*/
		
		
        
		
	}

}
