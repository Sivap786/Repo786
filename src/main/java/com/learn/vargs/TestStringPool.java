package com.learn.vargs;

import java.util.HashSet;
import java.util.Set;

public class TestStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="AB";
		String s2="BA";
		String s3 = new String("Ramu");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        
        Integer val = 127;
        System.out.println(val.hashCode());
        
        Integer val3 = 127;
        System.out.println(val3.hashCode());
        
        Set<String> s = new HashSet<String>();
        s.add("HI");
        System.out.println(s);
	}

}
