package com.common.ds;

import java.util.Stack;

public class JavaStackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(5);
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
	}

}
