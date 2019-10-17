package com.imooc.leo;

public class MergeSort1 {
	public void mergeSort(int[] arr) {
		__mergeSort(arr, 0, arr.length - 1);
	}
	
	//递归算法,对arr[l, r]的数组进行归并排序
	private void __mergeSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		int mid = (l + r)/2;
		__mergeSort(arr, l, mid);
		__mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}
	
	//将arr[l,mid]与arr[mid + 1] 归并  
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
}
