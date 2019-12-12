package com.imooc.leo;

public class QuickSort3 {
	public void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	private void quickSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		
		//partition
		
		swap(arr,l,(int)(Math.random()*(r-l+1)) + l);
		int v = arr[l];
		
		
		
		int lt = l;//arr[l+1..lt]<arr[l]
		int gt = r + 1;//arr[gt...r]>arr[l]
		int i = lt + 1 ;//arr[lt+1...i)==arr[l]
		
		while(i < gt) {
			if(arr[i] > v) {
				swap(arr, i, gt-1);
				gt--;
			}
			else if (arr[i] < v) {
				swap(arr, i, lt + 1);
				i++;
				lt++;
			}
			else {
				i++;
			}
		}
		
		
		swap(arr, l, lt);
		quickSort(arr, l, lt-1);
		quickSort(arr, gt, r);
		
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


}
