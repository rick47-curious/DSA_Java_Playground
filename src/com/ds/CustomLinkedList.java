package com.ds;


class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}


class LinkedList
{
	Node head = null;
	
	public void add(int num) 
	{
		Node newNode = new Node(num);
		
		Node current = head;
		
		if (head == null) {
			head = newNode;
		}else {
			while (current.next !=null)
				current = current.next;
			current.next = newNode;
		}
		
	}
	
	public void printValues() 
	{
		Node current = head;
		
		while (current != null) 
		{
			System.out.println(current.data);
			current = current.next; //Increment the pointer
		}
	}
	
	public void addFirst(int num) {
		Node newNode = new Node(num);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void delete(int num) {
		
		Node current = head;
		
//		while (current.next !=null) {
//			if (current.data == num) 
//			{
//				current.next = null;
//				break;
//			}
//			current = current.next;
//		}
		
		while (current.next !=null && current.next.data!=num) {
			current = current.next;
		}
		
		if (current.next!=null) 
		{
			//Set next to next element
			current.next = current.next.next;
		}
	}
}


public class CustomLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(2);
		list.add(5);
		
		list.add(7);
		
		list.addFirst(1);
		
		list.delete(5);
		
		list.printValues();
	}

}
