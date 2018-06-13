/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

package com.alexchenny;

import java.util.HashMap;
import java.util.Map;


//	TESTER METHOD
//
//	public static void main (String[] args) {
//		int[] nums = {2, -1, 8, 9, 9 , 2, 7, 19, 29, 38, 100,};
//		Two_Sum test = new Two_Sum();
//		int[] result = test.twoSum(nums, 37);
//		for (int i = 0; i < result.length; i ++) {
//			System.out.print(result[i] + " ");
//		}
//	}

class Two_Sum {
	int[] solution = new int[2];

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashmap = new HashMap<>();
		int comp;
		// populate hash map
		for (int i = 0; i < nums.length; i++) {
			// (key, value)
			hashmap.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			comp = target - nums[i];
			// if solution is found (make sure you're not returning the same index twice!)
			if (hashmap.containsKey(comp) && hashmap.get(comp) != i) {
				solution[0] = i;
				solution[1] = hashmap.get(comp);
				return solution;
			}
		}
		return null;
	}
}
