package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * kamal.verma-16-Sep-2025-8:32:59 pm
 */
public class Count2ndFrequentWordinList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> list =  Arrays.asList(
		            "apple", "orange", "banana", "mango", "apple", "orange"
		        );	
		   Map<String ,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		   System.out.println(map);
		   
		   Optional<Entry<String,Long>> secondFrequent=map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()).skip(1).findFirst();
		 
		   System.out.println(secondFrequent);
		  
		   List<Long> sortedFrequency = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		  
			  if(sortedFrequency.size()<2) {
				  System.out.println("No second most frequent word.");
		            return;
			  }
		  
		  Long secondHigest = sortedFrequency.get(1);
		  
		  List<String> secondFrequentWords = map.entrySet().stream().filter(f->f.getValue().equals(secondHigest)).map(data->data.getKey()).collect(Collectors.toList());
	
		  System.out.println(secondFrequentWords);
	}
}
