package com.sortingalgo;

public class SelectionSort {

	//Time complexity: O(n^2)
	//Less swapping hence better algorithm than BubbleSort 
	//if we do it using max, it will in descending order
	
	public static void performSelectionSort(int[] array) 
	{
		int minIndex = 0;
		int temp = 0;
		
		for (int i=0;i<array.length-1;i++) 
		{
			minIndex = i;
			
			for (int j=i+1;j<array.length;j++) 
			{
				if (array[minIndex] > array[j]) 
					minIndex = j;
			}
			
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] inputArray = {7,5,10,1,2,6};
		
		performSelectionSort(inputArray);
		
		System.out.println();
		for(int i:inputArray)
			System.out.print(i + " ");
	}

}
