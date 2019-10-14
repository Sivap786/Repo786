package com.learn.sort;

public class BubbleSort {

	public static void swap(int array[], int i, int j) {
		// Return if i equal to j
		if (i == j) {
			return;
		} else {
			// do swaping
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public static void main(String args[]) {
		int[] sourceArray = { 56, 34, 12, 98, 57, 99, 0 };
		// Iterate over list from last index to zero
		for (int sourceArrayLastIndex = sourceArray.length - 1; sourceArrayLastIndex >= 0; sourceArrayLastIndex--) {
			for (int compareIndex = 0; compareIndex < sourceArrayLastIndex; compareIndex++) {
				if (sourceArray[compareIndex] > sourceArray[compareIndex + 1]) {
					swap(sourceArray, compareIndex, compareIndex + 1);
				}
			}
		}

		for (int i = 0; i < sourceArray.length; i++) {
			System.out.println(sourceArray[i] + " ");
		}
	}
}
