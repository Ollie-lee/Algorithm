package com.imooc.leo;

public class MergeSort1 {
	public void mergeSort(int[] arr) {
		__mergeSort(arr, 0, arr.length - 1);
	}
	
	//�ݹ��㷨,��arr[l, r]��������й鲢����
	private void __mergeSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		int mid = (l + r)/2;
		__mergeSort(arr, l, mid);
		__mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}
	
	//��arr[l,mid]��arr[mid + 1] �鲢  
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
}
