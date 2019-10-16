package com.imooc.leo;

public class ShellSort {
	public void shellSort(int[] arr) {
		int h = 1;
		while(h<=arr.length/3) {
			//h��Ϊgap,��shellsort����Ĳ���
			//�˲���Ϊѡȡ����ʵĲ���
			h = 3*h + 1;
		}
		for( ; h > 0; h = (h - 1) / 3 ) {
			//���ѭ���������в���,�Բ���h=1Ϊ�յ�
			for(int i = h; i < arr.length; i++) {
				//���ѭ������������Ϊh�����ʱ,���鱻�ֳɺܶ�������
				for(int j = i; j>= h ; j = j - h ) {
					//�ֱ�����ǽ��в�������,��i���Ǳ������Ǹ�Ԫ��,j����i�Ƚϵ�Ԫ��
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
