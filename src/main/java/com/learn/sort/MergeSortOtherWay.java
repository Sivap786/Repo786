package com.learn.sort;
import java.util.Arrays;
public class MergeSortOtherWay {
	public static void main(String[] args) {
	    int[] inputArray = {4,1,2,5,3};
			MergeSortAlgorithm msa = new MergeSortAlgorithm();
			msa.sort(inputArray);
	  }
}
class MergeSortAlgorithm{
	  
	  public void sort(int[] inputArr){
	    splitPartitions(inputArr, inputArr.length);
	  }
	  private void splitPartitions(int[] inputArr, int inputArrayLength){
	    /*split given array into partitioins untill each array has only one element. 
			*Just break recurse earch array has only one element*/
			if(inputArrayLength < 2){
				return;
			}

			int mid = inputArrayLength/2;

			//From 0 to mid will be left part of given array
			int[] leftArray = new int[mid];
			for(int i = 0; i < mid; i++){
				leftArray[i] = inputArr[i];
			}

			//From mid+1 to end of array will be right part of given array
			int[] rightArray = new int[inputArrayLength - mid];
			for(int i = mid; i < inputArrayLength; i++){
				rightArray[i-mid] = inputArr[i];
			}

	  	splitPartitions(leftArray, mid); 
	    splitPartitions(rightArray, inputArrayLength-mid);
			sortAndMerge(inputArr,leftArray, rightArray, mid, inputArrayLength-mid);
			System.out.println("Sorted ARRAY:"+Arrays.toString(inputArr));
	  }
		private void sortAndMerge(int[] inputArr, int[] leftArray, int[] rightArray, int leftArraylength, int rightArrayLength) {
			System.out.println("GIVEN ARRAY AT ENTRY==>"+Arrays.toString(inputArr));
			System.out.println("LEFT:\t"+Arrays.toString(leftArray));
			System.out.println("RIGHT:\t"+Arrays.toString(rightArray));
				
	    int i = 0, j = 0, k = 0;
	    while (i < leftArraylength && j < rightArrayLength) {
	        if (leftArray[i] <= rightArray[j]) {
	            inputArr[k++] = leftArray[i++];
	        }
	        else {
	            inputArr[k++] = rightArray[j++];
	        }
	    }
	    while (i < leftArraylength) {
	        inputArr[k++] = leftArray[i++];
	    }
	    while (j < rightArrayLength) {
	        inputArr[k++] = rightArray[j++];
	    }
			System.out.println("GIVEN ARRAY AT Exit<=="+Arrays.toString(inputArr));
		}
	}
