package com.horizon.algorithm;

public class MergeSorted {

	public static void mergeSort(int[] list){
		if(list.length > 1){
			int[] halfLeft = new int[list.length / 2];
			System.arraycopy(list, 0, halfLeft, 0, list.length / 2);
			mergeSort(halfLeft);
			
			int[] halfRight = new int[list.length - list.length/2] ;
			System.arraycopy(list, list.length /2, halfRight , 0, list.length - list.length /2);
			mergeSort(halfRight) ;
			
			int[] temp = merge(halfLeft , halfRight) ;
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}

	private static int[] merge(int[] halfLeft, int[] halfRight) {
		int[] temp = new int[halfLeft.length + halfRight.length] ;
		int curIndex1 = 0 ;
		int curIndex2 = 0 ;
		int curIndex3 = 0 ;
		while(curIndex1 <  halfLeft.length && curIndex2 < halfRight.length){
			if(halfLeft[curIndex1] < halfRight[curIndex2]){
				temp[curIndex3++] = halfLeft[curIndex1 ++] ;
			}else{
				temp[curIndex3++] = halfRight[curIndex2 ++] ;
			}
		}
		while(curIndex1 < halfLeft.length) {
			temp[curIndex3++] = halfLeft[curIndex1 ++] ;
		}
		while(curIndex2 < halfRight.length){
			temp[curIndex3++] = halfRight[curIndex2 ++] ;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] list = {3,7,3,22,44,1,1} ;
		mergeSort(list);
		for(int temp : list){
			System.out.print(temp +" ");
		}
	}
}
