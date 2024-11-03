package com.searchalgo;

public class LinearSearch {

	// Time Complexity - O(n)
	//Array of random integers
	
	
	public static int linearSearch(int[] inputArray, int target) 
	{
		for(int i=0;i<inputArray.length;i++) 
		{
			if (inputArray[i] == target)
				return i+1;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
	
		int[] arrayInput = {2,3,7,10,5,6};
		
		int target = 7;
		
		int result = linearSearch(arrayInput,target);
		
		if (result!=-1)
			System.out.println("The element is found at index: "+result);
		else
			System.out.println("The element is not found!");

	}

}
