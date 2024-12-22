package com.common.ds;

import java.util.ArrayList;
import java.util.List;

public class JavaListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		//Common operations 

		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//Adding at a specified location
		
		list.add(1,2);
		System.out.println(list);
		
		//Find or search
		
		System.out.println(list.indexOf(1));
		
		System.out.println(list.lastIndexOf(3));
		
		//Update the value
		
		list.set(1, 7);
		
		System.out.println(list);
		
		//Contains check
		
		System.out.println(list.contains(2));
		
		//Get the index of element
		System.out.println(list.get(0));
		
		//Remove element
		
		list.remove(4);
		list.remove(0);
		
		System.out.println(list);
		
		//Additional methods for list
		
//		System.out.println(list.isEmpty());
//		list.clear();
//		System.out.println(list);
		
		//Sorting 
		list.sort((a,b)-> Integer.compare(a, b)); //ascending order
		list.sort((a,b)-> Integer.compare(b, a)); //descending order
		System.out.println(list);
	}

}
