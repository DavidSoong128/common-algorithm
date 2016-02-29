package com.horizon.algorithm;

public class InsertSorted {

	public static void insertSort(int[] list){
		for(int i=1 ; i < list.length ; i++){
			int currentValue = list[i] ;
			int position = i ;
			while(position >0 && list[position - 1] > list[position]){
				int temp = list[position-1] ;
				list[position-1] = list[position] ;
				list[position] = temp ;
				position -- ;
			}
			list[position] = currentValue ;
		}
	}
	public static void main(String[] args) {
		int[] list = {4,3,2,2,9,22,1} ;
		insertSort(list);
		for(int temp : list){
			System.out.print(temp +" ");
		}
	}
}
