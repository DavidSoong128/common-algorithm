package com.horizon.algorithm;

/**
 * select sort algorithm
 * 所谓的选择排序，就是外层遍历每个数字，然后内存遍历所有的数字，如果
 * 发现比外层选择出来的数字还小的话，就交换
 * @author : David.Song/Java Engineer
 * @date : 2016/2/29 15:51
 * @see
 * @since : 1.0.0
 */
public class SelectSort {
    //选择排序
    private static int[] selectionSort(int[] array){
        //每次循环找出相对最小值，并交换到头部
        for(int i=0;i<array.length-1;i++){
            int lowIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[lowIndex]) {
                    lowIndex = j;
                }
            }
            swap(array,lowIndex,i);
        }
        return array;
    }
    //交换数值
    private static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String args[]) {
        //选择排序
        int[] selectionArray = {3, 5, 7, 2, 1, 77, 444, 2};
        SelectSort.selectionSort(selectionArray);
        SelectSort.printArray(selectionArray);
    }
    //打印数组
    private static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
