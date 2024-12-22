package com.common.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JavaMapDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//Addition
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		System.out.println(map);
		
		//Verify 
		System.out.println(map.containsKey("b"));
		System.out.println(map.containsValue(4));
		
		//Get the value based on key
		System.out.println(map.get("a"));
		
		//Update a key
		map.put("c", 5);
		
		System.out.println(map);
		
		//Remove a key value pair
		
		map.remove("d");
		
		System.out.println(map);
		
		//Iteration of map
		for (Map.Entry<String, Integer> entry:map.entrySet()) 
		{
			System.out.println("Key: "+ entry.getKey() +" "+ "Value: "+entry.getValue());
		}
		
		
		//A very common problem set, frequency of number or character
		
		int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // put all elements in arraylist
        ArrayList<Integer> aa = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }
        
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();

        // counting occurrence of numbers
        for (int i = 0; i < aa.size(); i++) {
            h.putIfAbsent(aa.get(i), Collections.frequency(
                                         aa, aa.get(i)));
        }
        System.out.println(h);
	}

}
