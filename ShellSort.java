package com.imooc.leo;

public class ShellSort {
	public void shellSort(int[] arr) {
		int h = 1;
		while(h<=arr.length/3) {
			//h即为gap,是shellsort排序的步长
			//此步骤为选取最合适的步长
			h = 3*h + 1;
		}
		for( ; h > 0; h = (h - 1) / 3 ) {
			//这层循环遍历所有步长,以步长h=1为终点
			for(int i = h; i < arr.length; i++) {
				//这层循环遍历当步长为h的情况时,数组被分成很多子数组
				for(int j = i; j>= h ; j = j - h ) {
					//分别对他们进行插入排序,而i就是被插入那个元素,j是与i比较的元素
					if(arr[j - h] >arr[j] ) {
						int temp = arr[j];
						arr[j] = arr[j - h];
						arr[j - h] = temp;
					}else {
						break;
					}
				}
			}
		}
	}
}
