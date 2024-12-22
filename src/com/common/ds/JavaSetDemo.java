package com.common.ds;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		//LinkedHashSet can be used to create set too
		
		//Addition of elements
		set.add(2);
		set.add(3);
		set.add(4);
		
		set.add(5);
		
		System.out.println(set);
		
		//Check whether data exists
		
		System.out.println(set.contains(4));
		
		//No retrieval methods - point to note
		
		//Removal
		set.remove(5);
		
		System.out.println(set);
		
		//Additionally union,intersection, difference
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(8);
		set2.add(5);
		set2.add(3);
		set2.add(11);
		set2.add(12);
		
		//Union
		Set<Integer> union = new LinkedHashSet<Integer>(set1);
		union.addAll(set2);
		
		System.out.println(union);
		
		//Intersection
		Set<Integer> intersection = new LinkedHashSet<Integer>(set1);
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		//Difference
		Set<Integer> difference = new LinkedHashSet<Integer>(set1);
		difference.removeAll(set2);
		
		System.out.println(difference);
	}

}
