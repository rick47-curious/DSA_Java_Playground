package com.ds;

import java.util.Stack;

public class DefaultStack {

	public static void main(String[] args) {
		
		//LIFO - Last in first out
		Stack<Integer> stack = new Stack<Integer>();
		
		//Add elements
		stack.push(2);
		stack.push(3);
		stack.push(7);
		
		//Peek last element before pop
		System.out.println(stack.peek());
		
		//Remove elements from end
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
	}

}
