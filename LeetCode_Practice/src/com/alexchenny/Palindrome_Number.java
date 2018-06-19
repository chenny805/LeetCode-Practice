package com.alexchenny;

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads 
//the same backward as forward.
//	Example 1:
//		Input: 121
//		Output: true


public class Palindrome_Number {
	
//	TEST METHOD
//	public static void main (String[] args) {
//		isPalindrome(11);
//	}
	
	public boolean isPalindrome(int x) {
		String num = Integer.toString(x);

		int front = 0;
		int end = num.length()-1;
		
		// iterate through the whole number
		while (front != end && front < end) {
			// check if the numbers match at appropriate positions
			if (num.charAt(front) != num.charAt(end)) 
				return false;
			front++;
			end--;
		}
		return true;
    }
}
