package com.horizon.algorithm;
/**
 * @author Administrator
 *
 */
public class BubbleSorted {

	public static void bubbleSort(int[] array){
		if(array !=null){
			for(int i=0 ; i < array.length ;i ++){
				for(int j=0 ; j< array.length - i - 1 ; j++){
					if(array[j] > array[j+1]){
						int temp = array[j] ;
						array[j] = array[j+1] ;
						array[j+1] = temp ;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {3,2,4,5,6,0,11} ;
		bubbleSort(array); 
		for(int temp : array){
			System.out.print(temp + " ");
		}
	}
	
	
	
	
	
	
	
}
