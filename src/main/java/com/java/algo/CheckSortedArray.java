package com.java.algo;

public class CheckSortedArray {

	public static boolean checkSortedArray(int[] arr, int index) {
		boolean isSorted = true ;
		while (index >= 2 && isSorted) {
			if (arr[index - 2] <= arr[index - 1]) {
				isSorted = true ;
				return checkSortedArray(arr, index - 1);
			} else
				isSorted = false;
		}
		return isSorted;
	}

	public static void main(String[] args) {
		int[] arr = { 3,1,2 };
		System.out.println(checkSortedArray(arr, arr.length));
	}

}
