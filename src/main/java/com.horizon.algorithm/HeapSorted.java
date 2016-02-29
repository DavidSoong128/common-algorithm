package com.horizon.algorithm;

/**
 * @author Administrator
 *
 */
public class HeapSorted {

	public static int heap_size;

	public static int parent(int i) {
		return i / 2;
	}

	public static int leftChild(int i) {
		return 2 * i;
	}

	public static int rightChild(int i) {
		return 2 * i + 1;
	}

	/**
	 * @param a
	 * @param i
	 */
	public static void max_heapify(int[] a, int i) {
		int left = leftChild(i);
		int right = rightChild(i);
		int largest = 0;
		if (left < heap_size && a[i] < a[left]) {
			largest = left;
		} else {
			largest = i;
		}
		if (right < heap_size && a[right] > a[largest]) {
			largest = right;
		}
		if (largest == i) {
			return;
		} else {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			max_heapify(a, largest);
		}
	}

	/**
	 */
	public static void heapSort(int[] a) {
		/**
		 * @param a
		 */
		for (int i = a.length / 2; i >= 1; i--) {
			max_heapify(a, i);
		}

		for (int i = a.length - 1; i >= 2; i--) {
			int temp = a[1];
			a[1] = a[i];
			a[i] = temp;
			heap_size--;
			max_heapify(a, 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 0, 4, 1, 3, 2, 1, 1, 10, 14, 0, 2 };
		heap_size = a.length;
		heapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
