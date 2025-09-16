package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * kamal.verma-16-Sep-2025-8:13:32 pm
 */
public class WordOccurrenceCount {

	/**
	* @description - Find Count of Occurrence of word in list
	* @param -
	* @return -
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> list =  Arrays.asList(
		            "apple", "orange", "banana", "mango", "apple", "orange"
		        );	
		   Map<String ,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		   System.out.print(map);
		   
	}

}
