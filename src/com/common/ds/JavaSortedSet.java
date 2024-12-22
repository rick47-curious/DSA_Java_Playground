package com.common.ds;

import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSortedSet {

	public static void main(String[] args) {
		
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		
		
		//Addition
		
		sortedSet.add(3);
		sortedSet.add(1);
		sortedSet.add(4);
		sortedSet.add(7);
		sortedSet.add(2);
		
		System.out.println(sortedSet);

		
		//Retrieval
		System.out.println(sortedSet.contains(4));
		
		//Removal
		
		sortedSet.remove(2);
		System.out.println(sortedSet);
		
		
		
		
	}

}
