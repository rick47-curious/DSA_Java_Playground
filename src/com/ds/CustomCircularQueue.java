package com.ds;

class CircularQueue
{
	private int front = 0;
	private int rear = -1;
	private int size = 0;
	private int[] arr = new int[4];
	
	//Method to add elements to the rear
	public void enqueue(int data) 
	{
		if (!isFull()) 
		{
			rear = (rear+1) % 4; //4 is the size of the queue
			arr[rear] = data;
			size++;
		}else 
		{
			//System.out.println("Queue is full");
			throw new RuntimeException("Queue is Full");
		}
		
	}
	
	
	//Method to delete the values from the front
	public int dequeue() 
	{
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		
		int data = arr[front];
		front = (front+1) % 4; //4 is the size of the queue
		size--;
		return data;
	}
	
	//Returns the top value
	public int peek() 
	{
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		return arr[front];
	}
	
	public boolean isFull() 
	{
		return size == 4;
	}
	
	public boolean isEmpty() 
	{
		return size ==0;
	}
	
	//Method to show the values in the queue or print
	public void show() 
	{
		for (int i=front;i<=rear;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


public class CustomCircularQueue {

	public static void main(String[] args) {
		
		CircularQueue circularQueue = new CircularQueue();
		
		circularQueue.enqueue(10);
		circularQueue.enqueue(20);
		circularQueue.enqueue(30);
		circularQueue.enqueue(40);
		//circularQueue.enqueue(50); // Throws full queue
		
		circularQueue.show();
		System.out.println(circularQueue.dequeue());
		System.out.println(circularQueue.dequeue());
		System.out.println(circularQueue.dequeue());
		System.out.println(circularQueue.dequeue());
		//System.out.println(circularQueue.dequeue()); // Throws empty queue
		
		
	}

}
