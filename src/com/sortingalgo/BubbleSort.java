package com.sortingalgo;

public class BubbleSort {

	
	//Time complexity O(n^2)
	//Easiest but less efficient algorithm for sorting
	
	public static void performBubbleSort(int[] array)
	{
		int temp;
		
		for(int i=0;i<array.length;i++) 
		{
			for (int j=0;j<array.length - i - 1;j++) 
			{
				//Ascending order
				if (array[j] > array[j+1]) 
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] inputArray = {5,6,1,2,8,9};
		
		performBubbleSort(inputArray);

		for(int i:inputArray)
			System.out.println(i);
	}

}
