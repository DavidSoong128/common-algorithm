package com.horizon.algorithm;

/**
 * @since : 1.0.0
 * @see
 */
public class CountingSort {

	public static void Sort(int[] A, int k)
	{

		int[] C = new int[k + 1];

		for (int j = 0; j < A.length; j++) {
			C[A[j]]++;
		}
		
		int z = 0;
		for (int i = 0; i <= k; i++) {
			while (C[i]-- > 0) {
				A[z++] = i;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] A = new int[]{3,22,1,55,22,66};
		Sort(A, 66);
		for(int k : A){
			System.out.println(k);
		}
	}
}
