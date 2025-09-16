package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * kamal.verma-16-Sep-2025-9:52:05 pm
 */
public class ListToMapValueAsLength {

	/**
	* @description - 
	* @param -
	* @return -
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =  Arrays.asList("apple", "orange", "banana", "mango", "apple", "orange");
		
		Map<String,Set<Integer>> mapAsIntegerList = list.stream().collect(Collectors.groupingBy(value->value,Collectors.mapping(String::length, Collectors.toSet())));
		Map<String,Integer> mapAsIntegerValue = list.stream().collect(Collectors.toMap(value->value, value->value.length(),(oldValue,newvalue)->oldValue));

		System.out.println(mapAsIntegerList);
		System.out.println(mapAsIntegerValue);
	}

}
