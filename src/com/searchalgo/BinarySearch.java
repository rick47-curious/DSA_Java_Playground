package com.searchalgo;

public class BinarySearch {

	//Time complexity - O(log n)
	//The array should be sorted initially - ascending
	
	//If descending sort performed earlier - The twp conditional block statements will be swapped
	public static int binarySearch(int[] inputArray,int target) 
	{
		int left = 0;
		int right = inputArray.length - 1;
		
		
		while (left <= right) 
		{
			int mid = (left + right)/2;
			
			if (inputArray[mid] == target)
				return mid+1;
			else if (inputArray[mid] < target)
				left = mid + 1;
			else if (inputArray[mid] > target)
				right = mid -1;
		}
		
		return -1;
	}
	

	public static void main(String[] args) 
	{

		int[] arrayInput = {1,4,7,19,20,25};
		int target = 19;
		
		int result = binarySearch(arrayInput,target);
		
		if (result!=-1)
			System.out.println("The element is found at index: "+result);
		else
			System.out.println("The element is not found");

	}

}
