package com.horizon.algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * 桶排序
 * @author : David.Song/Java Engineer
 * @date : 2016/2/29 18:15
 * @see
 * @since : 1.0.0
 */
public class BucketSort {

    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 20 };
        sort(data,1,20,2);
        for(int i=0;i<data.length;i++) {
            System.out.print(data[i] +",");
        }
    }
    /**
     * 桶排序
     * @param array 数组
     * @param min 数组中最小数字
     * @param max 数组中最大数字
     * @param step 桶內数字区间
     * @return
     */
    private static int[] sort( int[] array , int min , int max ,int step){
        List<List<Integer>> list = new LinkedList<>();
        // 建桶
        for( int i = min ; i <= max ; i = i + step ){
            List<Integer> bucket = new LinkedList<>();
            list.add(bucket);
        }

        // 将数据放入对应桶内
        for( int i = 0 ; i < array.length ; i++ ){
            int index = (array[i] - min) / step ;
            list.get(index).add(array[i]);
        }

        // 对每个桶内部排序（可以递归桶排序）
        for( int i = 0 ; i < list.size() ; i++ ){
            list.set(i,insert(list.get(i)));
        }

        // 将排序后的桶放回数组
        int k = 0;
        for( int i = 0 ; i < list.size() ; i++ ){
            List<Integer> temp = list.get(i);
            for( int j = 0 ; j < temp.size() ; j++ ){
                array[k] = temp.get(j);
                k++;
            }
        }
        return array;
    }
    /**
     * 桶内排序，该程序用的是插入排序（仅仅是因为int[]改为List比较方便而已，可以使用其他方法，甚至递归桶排序）
     * @param list
     * @return
     */
    private static List<Integer> insert( List<Integer> list ) {
        for (int i = 1; i < list.size() ; i++) {
            int key = list.get(i);
            int j = i - 1;
            while ( j >= 0 && list.get(j) > key ) {
                list.set(j+1,list.get(j));
                j = j - 1;
            }
            list.set(j+1,key);
        }
        return list;
    }
}
