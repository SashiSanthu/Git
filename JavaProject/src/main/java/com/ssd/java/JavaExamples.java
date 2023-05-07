package com.ssd.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaExamples {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajio", "santhu", "anil", "Ajay", "sravani");
		char startingLetter = 'A';
	List<Object> filterName = names.stream().filter(name -> name.charAt(0) == startingLetter).collect(Collectors.toList());
	
   System.out.println(filterName);
	}

}
