package com.ssd.java;

public class StringRevers {
// halfname is Normal & halfname is revers?
	public static void main(String[] args) {
		
		String name ="Santhoshi";
		int length = name.length();
		int halfLength = length/2;
		
		String firstHalf = name.substring(0,halfLength);
		String secondHalf = name.substring(halfLength,length);
		
		String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
		
String reverseName = firstHalf+reversedSecondHalf;
System.out.println(reverseName);
	}

}
