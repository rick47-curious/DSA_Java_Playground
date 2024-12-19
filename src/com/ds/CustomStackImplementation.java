package com.ds;

class Stack{
	
	int[] stackNum = new int[5];
	int top;
	int size;
	
	public Stack() {
		size = stackNum.length;
		top = -1;
	}
	
	public void push(int num) {
		
		if (top<size) {
			stackNum[++top] = num;
		}else {
			System.out.println("Stack overflow");
		}
		
	}
	
	public int pop() {
		
		if (top>-1) {
			size--;
			return stackNum[top--];
		}else {
			System.out.println("Stack underflow");
		}
		return 0;
		
	}
	
	public int peek() {
		return stackNum[top];
	}
	
	public void printStack() {
		
		for (int i=0;i<size;i++) {
			System.out.print(stackNum[i] + " ");
		}
		System.out.println();
	}
	
}


public class CustomStackImplementation {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack.pop());
		stack.printStack();
		System.out.println(stack.peek());

	}

}
