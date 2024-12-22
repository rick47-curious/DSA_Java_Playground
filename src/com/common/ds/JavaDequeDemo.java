package com.common.ds;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> dequeue = new ArrayDeque<Integer>();
		
		//Addition
		dequeue.add(3); //tail of dequeue
		dequeue.addFirst(1);//First
		dequeue.addLast(2);//last
		
		//Other methods are also offered - offer() to add elements
		dequeue.offerFirst(5);
		
		System.out.println(dequeue);
		
		//Accessing the elements
		
		System.out.println(dequeue.getFirst());
		System.out.println(dequeue.getLast());
		
		System.out.println(dequeue.peek());//head of the element
		System.out.println(dequeue.peekFirst());
		System.out.println(dequeue.peekLast());//last element of dequeue
		System.out.println(dequeue.element()); //Equivalent to getFirst()
		
		//Removing the elements
		
		dequeue.removeFirst();
		dequeue.removeLast();
		
		//dequeue.remove() - removes the first element of the array
		
		dequeue.poll();
//		dequeue.pollFirst();
//		dequeue.pollLast();
//		dequeue.pop();//First element of the queue
		
		System.out.println(dequeue);
	}

}
