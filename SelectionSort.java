package com.imooc.leo;

public class SelectionSort {
	public void selectionSort(int[] list) {
		//Ѱ��[i,list.length)�е���Сֵ
		for(int i = 0; i < list.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j <list.length; j++) {
				//�������iλԪ����ΪminIndex, �������[minIndex,list.length)�е�
				//Ԫ�طֱ���бȽ�,���յó���СԪ�ص����
				if(list[j] < list[minIndex]) {
					minIndex = j;
				}
			}
			//��Ԫ�ص�minIndex����Ԫ�ص�[i]���Ե�
			int temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
	}
}
