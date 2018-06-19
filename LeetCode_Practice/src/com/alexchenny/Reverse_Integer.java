package com.alexchenny;

public class Reverse_Integer {
	public int reverse(int x) {
		int result = 0;
		int digit = 0;
		while (x > 0) {
			// store each digit
			digit = x % 10;
			x /= 10;
			// check if 
			if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) 
				return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) 
            	return 0;
			result = result * 10 + digit;
		}
	return result;
	}
}
