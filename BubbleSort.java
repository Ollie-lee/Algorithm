package com.imooc.leo;
/*
1）冒泡排序在第k轮循环以后，保证的是最后k个数字有序；
而插入排序在第k轮循环以后，保证的是前k个数字有序；
2）
冒泡排序在第k轮循环以后，最后k个数字就是整个数组排序后的结果，即最后k个数字就是整个数组top k大的数字；
而插入排序在第k轮循环以后，前k个数字还是原来数组中的前k个数字。此时，最小值不一定在前k个数字中，可能在后续还没有处理。
比较一下，对于冒泡排序，第一轮循环以后，最大的数字就已经放在最后的位置了；第二轮循环以后，第二大的数字就已经放在倒数第二的位置了，以此类推...
 */
public class BubbleSort {
	public void bubbleSort(int[] arr) {
		//外层循环控制哪个元素作为交换的起点
		//内层循环控制每轮交换的实现
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	

}
