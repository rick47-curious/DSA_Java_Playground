package com.common.ds;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueueDemo {

	public static void main(String[] args) {
		
		//Null values are not allowed
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		//For PriorityBlockingQueue and LinkedList implementation - We get add,peek, poll methods for usage
		//Addition - always from the end 
		
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		//another method to add element in the priorityQueue
		queue.offer(7);
		
		System.out.println(queue);
		
		//To get the first element of the queue
		System.out.println(queue.peek());
		
		//To remove the first element of the queue
		System.out.println(queue.poll());
		
		//Another method to remove element in the priorityQueue
		queue.remove(5); // removes by providing element
		System.out.println(queue);
		
		//Gets the size of the queue
		System.out.println(queue.size());
		
		//Check for element
		System.out.println(queue.contains(6));
		
		System.out.println(queue.isEmpty());
		
		//To Clear
		queue.clear();
		
		System.out.println(queue);
		
		
	}

}
