package com.imooc.leo;

public class BinarySearch {
	//输入要查找的元素,找到返回序号,没有找到返回-1
	public int binarySearch(int[] arr, int target) {
		int l=0;
		int r=arr.length-1;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]>(target)) 
				r = mid -1;
			else
				l = mid +1;		
		}
		return -1;
	}
}
