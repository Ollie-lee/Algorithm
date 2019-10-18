package com.imooc.leo;

public class MergeSort2 {
	public void mergeSort2(int[] arr) {
		//外层循环控制每次sz内的元素个数
		for(int sz = 1; sz<= arr.length; sz += sz) {
			//内层循环控制merge的区域
			for(int i = 0; i + sz<arr.length; i += sz + sz) {
				merge(arr, i, i + sz - 1, min(i + sz + sz - 1, arr.length - 1));
				
			}
		}
	}
	
	private void merge(int[] arr, int l, int mid, int r) {
		//创建一个auxiliary辅助数组, 复制原数组的值,
		//在auxiliary辅助数组内进行i与j的比较,
		//把较小值返回给arr[]数组
		int[] aux = new int[r - l + 1];
		for(int i = l ; i<= r; i++) {
			aux[i - l] = arr[i];
		}
		//i是左边子数组比较的元素
		//j是右边子数组比较的元素
		int i = l;
		int j = mid + 1;
		//k是向arr[]数组复制的的位置
		for(int k = l; k<= r; k++) {
			if(i > mid) {
				arr[k] = aux[j - l];
				j++;
			}
			else if(j > r) {
				arr[k] = aux[i - l];
				i++;
			}
			else if(aux[i - l] < aux[j - l]) {
				arr[k] = aux[i - l];
				i++;
			}
			else{
				//此处同时处理了aux[i] = aux[j]相等时的情况
				arr[k] = aux[j - l];
				j++;
			}
		}
	}
	
	private int min(int a, int b) {
		if(a >= b)
			return b;
		else
			return a;
	}
}
