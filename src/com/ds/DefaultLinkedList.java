package com.ds;

import java.util.LinkedList;

public class DefaultLinkedList {

	public static void main(String[] args) {
		
		//LinkedList two types  - Linear, Doubly linkedList
		//Similarly - Circular linkedList, Doubly circular linkedList
		
		//Using the java.util package 
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//add number at end
		list.add(3);
		list.add(6);
		
		//add number at the first
		list.addFirst(1);

		//Replace the element at specified index
		list.set(1, 9);
		
		//Add at specified index
		list.add(1, 7);
		
		System.out.println(list);
		
		//To retreive the head
		System.out.println(list.peek());
		
		//Retreive the element at a given index
		System.out.println(list.get(2));
		
	}

}
