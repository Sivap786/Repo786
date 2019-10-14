package com.practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {64, 34, 25, 12, 22, 11, 90};
		//Iterate over array from highest index to zero
		for(int sourceArrayIndex = sourceArray.length-1; sourceArrayIndex >= 0; sourceArrayIndex--) {
			System.out.println("Index:"+sourceArrayIndex+" Value:"+sourceArray[sourceArrayIndex]);
			for(int j = 0; j < sourceArrayIndex; j++) {
				System.out.println("Inner Index:"+j+" Inner Value:"+sourceArray[j]);
				if(sourceArray[j] > sourceArray[j+1]) {
					swap(sourceArray, j, j+1);
				}
			}
		}
		
		for(int i = 0; i < sourceArray.length; i++) {
			System.out.println(sourceArray[i]+" ");
		}
	}
	
	public static void swap(int array[],int lowerValueIndex,int upperValueIndex) {
		//return if lowerValueIndex == upperValueIndex
		if(lowerValueIndex == upperValueIndex) {
			return;
		}else {
			//Do swapping here
			int temp = array[lowerValueIndex];
			array[lowerValueIndex] = array[upperValueIndex];
			array[upperValueIndex] = temp;
		}
	}

}
