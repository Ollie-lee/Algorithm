package com.imooc.leo;

public class MergeSort2 {
	public void mergeSort2(int[] arr) {
		//���ѭ������ÿ��sz�ڵ�Ԫ�ظ���
		for(int sz = 1; sz<= arr.length; sz += sz) {
			//�ڲ�ѭ������merge������
			for(int i = 0; i + sz<arr.length; i += sz + sz) {
				merge(arr, i, i + sz - 1, min(i + sz + sz - 1, arr.length - 1));
				
			}
		}
	}
	
	private void merge(int[] arr, int l, int mid, int r) {
		//����һ��auxiliary��������, ����ԭ�����ֵ,
		//��auxiliary���������ڽ���i��j�ıȽ�,
		//�ѽ�Сֵ���ظ�arr[]����
		int[] aux = new int[r - l + 1];
		for(int i = l ; i<= r; i++) {
			aux[i - l] = arr[i];
		}
		//i�����������Ƚϵ�Ԫ��
		//j���ұ�������Ƚϵ�Ԫ��
		int i = l;
		int j = mid + 1;
		//k����arr[]���鸴�Ƶĵ�λ��
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
				//�˴�ͬʱ������aux[i] = aux[j]���ʱ�����
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
