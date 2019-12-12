package com.imooc.leo;

public class QuickSort2 {
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private void quickSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		
		int p = partition(arr, l, r);
		quickSort(arr, l, p - 1);
		quickSort(arr, p + 1, r);
	}
	
	private int partition(int[] arr, int l, int r) {
		swap(arr, l, (int)(Math.random()*(r-l+ 1))+l);
		int v = arr[l];
		//arr[l+1....i)<v ; arr(j....r]>v
		int i = l+1;
		int j = r;
		while(true) {
			while(arr[i] < v && i <= r)
				i++;
			while(arr[j] > v && j >= l + 1)
				j--;
			if(i > j)
				break;
			swap(arr,i,j);
			i++;
			j--;
		}
		
		swap(arr,l,j);
		return j;
	}
	
	private void swap(int[] arr, int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
