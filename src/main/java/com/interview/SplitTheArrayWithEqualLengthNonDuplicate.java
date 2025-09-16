package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * kamal.verma-16-Sep-2025-9:09:20 pm
 */
public class SplitTheArrayWithEqualLengthNonDuplicate {

	/**
	* @description - 
	* @param -
	* @return -
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {1,1,2,2,3,4};
		Integer[] canSplitEqualSumTrue = {1, 2, 3, 3,3};
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("canBeSpitEqualLengthDistinctValue-->"+canBeSpitEqualLengthDistinctValue(arr));
		System.out.println("canSplitEqualSum-->"+canSplitEqualSum(arr));
		System.out.println("canSplitEqualSum-->"+canSplitEqualSum(canSplitEqualSumTrue));


	}
	
	private static boolean canBeSpitEqualLengthDistinctValue(Integer[] nums) {
		Map<Integer,Integer> freqMap = new HashMap<>();
		
		for(Integer num:nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
			if(freqMap.get(num)>2) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean canSplitEqualSum(Integer[] nums) {
		int totalSum = 0;
		for(Integer num:nums) {
			totalSum+=num;
		}
		int leftSum = 0;
		for(int i=0;i<nums.length;i++) {
			leftSum+=nums[i];
			int rightSum = totalSum-leftSum;
			if(leftSum==rightSum) {
				System.out.println("Split at index " + i + ": Left=" + leftSum + ", Right=" + rightSum);
				Integer[] left = Arrays.copyOfRange(nums, 0, i + 1);
				Integer[] right = Arrays.copyOfRange(nums, i + 1, nums.length);
				
				System.out.println("Left part  = " + Arrays.toString(left));
			    System.out.println("Right part = " + Arrays.toString(right));
                return true;
			}
		}
		
		return false;
	}

}
