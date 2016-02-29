package com.horizon.algorithm;

public class QuickSorted {

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	private static void quickSort(int[] list, int first, int high) {
		if (high > first) {
			int keyIndex = partition(list, first, high);
			quickSort(list, 0, keyIndex - 1);
			quickSort(list, keyIndex + 1, high);
		}
	}

	private static int partition(int[] list, int low, int high) {
		int privotKey = list[low];
		while (high > low) {
			while(low < high && list[high] >= privotKey) {
				high--;
			}
			list[low] = list[high];
			
			while(low < high && list[low] <= privotKey) {
				low++;
			}
			list[high] = list[low];
		}
		list[low] = privotKey;
		return low;
	}
	public static void main(String[] args) {
		
		int[] list = {3,7,3,22,44,44,5} ;
		quickSort(list);
		for(int temp : list){
			System.out.print(temp +" ");
		}
	}
}
