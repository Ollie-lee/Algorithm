package com.imooc.leo;

public class QuickSort {
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	//��arr�����[l,r]���п�������,�ݹ��㷨
	private void quickSort(int[] arr, int l, int r) {
		if(l >= r)
			return;
		int p = partition(arr, l, r);
		quickSort(arr, l, p-1);
		quickSort(arr, p + 1, r);
	}
	
	//��arr�����[l,r]���ֽ���partition����
	//����p,ʹ��arr[l,p-1]<arr[p],arr[p+1,r]>arr[p]
	private int partition(int[] arr, int l, int r) {
		//Math.random() = [0,1)
		//Math.random()*(r-l) = [0,r-1);
		//Math.random()*(r-l) + 1 = [1,r-1];
		//Math.random()*(r-l+1) + l) = [l+1,r];
		//int v = arr[(int)(Math.random()*(r-l+1)) + l];
		//������ע���ڵķ���ʱ,��������߼���ƥ��,�����l+1����ʼ�����������
		//���������arr[l]��ֵ���������λ�õ�Ԫ�ص�ֵ����λ��
		swap(arr,l, (int)(Math.random()*(r-l+1)) + l);
		int v = arr[l];
		
		//arr[l + 1, j] < v; arr[j + 1, i - 1] < v
		int j = l;//��ʼ����ֵ�ǳ��ؼ�,��֤��������������Ϊ��
		for(int i = l + 1; i <= r; i++) {
			//���arr[i]<v, �ͽ�����arr[j+1]����,j++, �����ֱ��i++,����������
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
		//�±�Ϊ����ʾ��,�˴�ֻ����������,��Ҫ�ٵ���������Ӧ��ֵ
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
