package com.imooc.leo;

public class InsertionSort {
	public void insertionSort1(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}else {
					break;
				}
			}
		}
		for(int n : arr) {
			System.out.print(n + "");
		}
	}

	public void insertionSort2(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			//cur:arr[i]的副本
			//j:arr[i]应该插入的位置
			int j = i;
			for(; j > 0; j-- ) {
				if(arr[j - 1] > cur) {
					arr[j] = arr[j - 1];
				}else {
					break;
				}
			}
			arr[j] = cur;
		}
		for(int n : arr) {
			System.out.print(n + "");
		}
	}

	public void insertionSort3(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i - 1;
			for(; j >= 0; j--) {
				if(arr[j] > cur) {
					arr[j + 1] = arr[j];
				}else {
					break;
				}
			}
			arr[j + 1] = cur;
		}
		for(int n : arr) {
			System.out.print(n + "");
		}
	}
}
