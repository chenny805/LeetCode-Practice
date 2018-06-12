package com.alexchenny;

public class Remove_Duplicates_From_Sorted_Array {
	
//	TESTER METHOD
//	
//	public static void main (String[] args) {
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
//		Remove_Duplicates_From_Sorted_Array testObj = new Remove_Duplicates_From_Sorted_Array();
//		int length = testObj.removeDuplicates(nums);
//		System.out.println(length);
//	}

	  public int removeDuplicates(int[] nums) {
			if (nums.length == 0) 
				return 0;
			int a = 0;
		    int b = 1;
		    while (b<nums.length) {
		    	if (nums[a] != nums[b]) {
		    		a++;
		    		nums[a] = nums[b];
		    	}
		    	b++;
		    }
		    return a+1;
		}
	
}
