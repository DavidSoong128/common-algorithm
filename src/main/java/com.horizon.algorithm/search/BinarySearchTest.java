package com.horizon.algorithm.search;

public class BinarySearchTest {

	public static int binarySearch(int[] arry, int x) {

		if (arry != null) {
			int lower = 0;
			int height = arry.length - 1;
			while (lower <= height) {

				int middle = (lower + height) / 2;
				if (arry[middle] < x) {
					lower = middle + 1;
				}

				if (arry[middle] > x) {
					height = middle - 1;
				}

				if (arry[middle] == x) {
					return middle;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 9, 10, 44, 67 };
		int index = BinarySearchTest.binarySearch(a, 9);
		System.out.println(index);
	}

}
