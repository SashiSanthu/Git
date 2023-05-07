package com.ssd.For;

import java.util.HashSet;

public class ForExample {
	
	public static void main(String[] args) {
		String ss="oipaipoidoa";
		
		String[] arr=ss.split("");
		HashSet<String> set=new HashSet<String>();
		for(String hh:arr) {
			set.add(hh);
		}
		System.out.println(set);
		}

}
