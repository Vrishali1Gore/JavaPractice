package com.CodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class Code02TwoSumChallenge {

	public static void main(String[] args) {
		int[] numbers = {2, 7, 3, 5,4};
		int target = 15;
		int[] result = twoSum(numbers , target);
		System.out.println(result[0]+" "+ result[1]);
	}
	
	public static int[] twoSum(int[] num , int target) {
		int delta ;
		
		Map<Integer,Integer> visitedNumbers = new HashMap<Integer,Integer>();
		
		for(int i = 0;i<num.length;i++) {
			
			delta = target - num[i];
			
			if(visitedNumbers.containsKey(delta)) {
				return new int[] {i,visitedNumbers.get(delta)};
			}else {
				visitedNumbers.put(num[i], i);
			}
			
		}
		return new int[] {-1,-1};
	}

}
