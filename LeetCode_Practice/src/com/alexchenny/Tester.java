package com.alexchenny;

public class Tester {
	public static void main (String[] args) {
		int test = 2147483647;
		System.out.println(test);
		Reverse_Integer testObj = new Reverse_Integer();
		test = testObj.reverse(test);
		System.out.println(test);
	}
}
