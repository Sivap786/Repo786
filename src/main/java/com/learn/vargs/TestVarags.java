package com.learn.vargs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestVarags {

	public static void main(String args[]) {
		test("hellow","cat");
	}
	
	public static void test(String ... a) {
		String nullString = null;
		Set<String> s = new HashSet<String>();
        s.add(nullString);
        //s.add("BYE");
        //s.add("A");
        System.out.println(s.hashCode());
        
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        m.put(10, 3);
        System.out.println(m.hashCode());
        /*
		for(String x : a) {
			System.out.println(a);
		}*/
        
        
        int i = 1;
        System.out.println(new Integer(i).toBinaryString(17));
        System.out.println(new Integer(i).toBinaryString(-17));
	}
}
