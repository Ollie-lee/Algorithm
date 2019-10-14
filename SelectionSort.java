package com.imooc.leo;

public class SelectionSort {
	public void selectionSort(int[] list) {
		//寻找[i,list.length)中的最小值
		for(int i = 0; i < list.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j <list.length; j++) {
				//将数组第i位元素设为minIndex, 随后将其与[minIndex,list.length)中的
				//元素分别进行比较,最终得出最小元素的序号
				if(list[j] < list[minIndex]) {
					minIndex = j;
				}
			}
			//将元素的minIndex处与元素的[i]处对调
			int temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
	}
}
