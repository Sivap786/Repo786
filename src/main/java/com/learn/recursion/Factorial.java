package com.learn.recursion;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.findFactorial(5000));
		//System.out.println(fact.findFactorialWithoutRecur(4));
	}
	
	public long findFactorial(long i) {
		if(i == 1) return 1;
		else {
			System.out.println(i);
			long result = i * findFactorial(i-1);
			return result;
		}
	}
	
	public int findFactorialWithoutRecur(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++ ) {
			result = result*i;
		}
		return result;
	}

}
