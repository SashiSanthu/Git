package com.ssd;

import java.util.HashSet;

public  class Test{
	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<Integer>();
	System.out.println(sumofSquares(2, hs));	
		
		
	}
	public static boolean sumofSquares(int l,HashSet<Integer> hs) {
		if(l==1) 
			
		return false;
		if(hs.contains(l))
			return true;
		
		hs.add(l);
		String numStr =Integer.toString(l);
		int sum=0;
		
		for(int i = 0; i<numStr.length(); i++ ) {
			int digit= Character.getNumericValue(numStr.charAt(i));
			sum +=digit*digit;
			
		}
		System.out.println(sum);
		
	return sumofSquares(sum,hs);

}}
