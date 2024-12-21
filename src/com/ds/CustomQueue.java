package com.ds;

class Queue
{
	private int front = 0;
	private int rear = -1;
	private int size = 0;
	private int[] arr = new int[4];
	
	//Method to add elements to the rear
	public void enqueue(int data) 
	{
		rear++;
		arr[rear] = data;
		size++;
	}
	
	
	//Method to delete the values from the front
	public int dequeue() 
	{
		return arr[front++];
	}
	
	//Method to show the values in the queue or print
	public void show() 
	{
		for (int i=front;i<size;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class CustomQueue {
	
	public static void main(String[] args) {
		
		//Queue queue = new Queue();
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		queue.show();
		
		System.out.println(queue.dequeue());
		
		queue.show();
		
		//queue.enqueue(50); //throws a array out of bound exception
		
		/*
		 * Now after the dequeue we still have a space in the beginning but still we cannot enter the value
		as rear still points to the last element in the array. 
		Therefore , we have circular queue, where rear can point back to the initial starting point
		*/
	}

}
