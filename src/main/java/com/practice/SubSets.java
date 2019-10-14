package com.practice;

public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3};
		findSubsets(array);
	}

	private static void findSubsets(int array[])
	{
	  int numOfSubsets = 1 << array.length; 

	  for(int i = 0; i < numOfSubsets; i++)
	 {
	    int pos = array.length - 1;
	   int bitmask = i;

	   System.out.print("{");
	   while(bitmask > 0)
	   {
	    if((bitmask & 1) == 1)
	     System.out.print(array[pos]+",");
	    bitmask >>= 1;
	    pos--;
	   }
	   System.out.print("}");
	 }
	}
}
