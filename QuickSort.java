package com.imooc.leo;

public class QuickSort {
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	//对arr数组的[l,r]进行快速排序,递归算法
	private void quickSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		int p = partition(arr, l, r);
		quickSort(arr, l, p-1);
		quickSort(arr, p + 1, r);
	}
	
	//对arr数组的[l,r]部分进行partition操作
	//返回p,使得arr[l,p-1]<arr[p],arr[p+1,r]>arr[p]
	private int partition(int[] arr, int l, int r) {
		//Math.random() = [0,1)
		//Math.random()*(r-l) = [0,r-1);
		//Math.random()*(r-l) + 1 = [1,r-1];
		//Math.random()*(r-l+1) + l) = [l+1,r];
		//int v = arr[(int)(Math.random()*(r-l+1)) + l];
		//当采用注释内的方法时,与下面的逻辑不匹配,比如从l+1处开始遍历这类操作
		//随机化即将arr[l]的值与数组随机位置的元素的值交换位置
		swap(arr,l, (int)(Math.random()*(r-l+1)) + l);
		int v = arr[l];
		
		//arr[l + 1, j] < v; arr[j + 1, i - 1] < v
		int j = l;//初始化的值非常关键,保证了上面两个数组为空
		for(int i = l + 1; i <= r; i++) {
			//如果arr[i]<v, 就将其与arr[j+1]交换,j++, 否则就直接i++,不用做操作
			if(arr[i] < v)
			{
				/*int temp = arr[i];
				arr[i] = arr[j + 1];
				arr[j + 1] = temp;*/
				swap(arr,i,j+1);
				j++;
			}
		}
		/*int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;*/
		swap(arr,l,j);
		//下边为错误示范,此处只调换了索引,还要再调换索引对应的值
		/*swap(l,j);
		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;*/
		
		
		return j;
	}
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
}
