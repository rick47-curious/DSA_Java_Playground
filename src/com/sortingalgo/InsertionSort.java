package com.sortingalgo;

public class InsertionSort {

	//Time complexity - O(n^2)
	
	public static void performInsertionSort(int[] array) 
	{
		int key = 0;
		int j=0;
		
		for (int i=1;i<array.length;i++) 
		{
			key = array[i];
			j = i-1;
			
			while (j>=0 && array[j] > key) 
			{
				array[j+1] = array[j];
				j--;
			}
			//To increase the index after penultimate step
			array[j+1] = key;
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		int[] inputArray = {4,2,1,7,5};

		performInsertionSort(inputArray);
		
		for(int i:inputArray)
			System.out.print(i + " ");
	}

}
