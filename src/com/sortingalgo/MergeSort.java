package com.sortingalgo;

public class MergeSort {

	private static void mergeSort(int[] arr,int l,int r) 
	{
		if (l < r) 
		{
			int mid = (l+r)/2;
			
			//Divide and conquer
			mergeSort(arr,0,mid);
			
			mergeSort(arr,mid+1,r);
			
			mergeArray(arr,l,mid,r);
		}
	}
	
	private static void mergeArray(int[] arr,int l,int mid,int r) 
	{
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];
		int i=0,j=0,k=l;
		
		
		//Copy array values
		for (int x=0;x<n1;x++) 
		{
			//left of array segment added with increasing index
			lArr[x] = arr[l+x];
		}
		
		for(int y=0;y<n2;y++) 
		{
			//right of array segment added with increasing index
			rArr[y] = arr[mid+1+y];
		}
		
		while (i<n1 && j<n2) {
			
			if (lArr[i] <=rArr[j]) 
			{
				arr[k] = lArr[i];
				i++;
			}else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		
		//Copy rest of the elements (if present) of both left and right arrays
		while(i<n1) 
		{
			arr[k] = lArr[i];
			i++;
			k++;
			
		}
		
		while(j<n2) 
		{
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,10,1,7,5,4};
		
		mergeSort(arr, 0, arr.length-1);
		
		for(int num:arr) 
		{
			System.out.print(num + " ");
		}
	}

}
