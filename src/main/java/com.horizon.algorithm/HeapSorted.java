package com.horizon.algorithm;

/**
 *1: 初始化成堆
 *  堆实际上是一棵完全二叉树，其任何一非叶节点满足性质：
 	Key[i]<=key[2i+1]&&Key[i]<=key[2i+2]或者Key[i]>=Key[2i+1]&&key>=key[2i+2]
    即任何一非叶节点的关键字不大于或者不小于其左右孩子节点的关键字
  2：操作过程如下：
    1)初始化堆：将R[1..n]构造为堆；
    2)将当前无序区的堆顶元素R[1]同该区间的最后一个记录交换，然后将新的无序区调整为新的堆。
    因此对于堆排序，最重要的两个操作就是构造初始堆和调整堆，其实构造初始堆事实上也是调整堆的过程，
    只不过构造初始堆是对[*****所有的非叶节点*****]都进行调整。

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
		if (largest != i) {
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
		 * 先构建堆，这里处理所有的非叶子结点
		 * @param a
		 */
		for (int i = a.length / 2; i >= 1; i--) {//非叶节点最大序号值为size/2
			max_heapify(a, i);
		}

		//依次将第一个和最后一个元素交换，然后重新调整堆，这样最终成为一个有序的堆结构
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
