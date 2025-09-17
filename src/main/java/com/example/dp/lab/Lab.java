package com.example.dp.lab;

public class Lab {
	public static void main(String[] args) {
	System.out.println("Hello, world!");	
	}
	
	public boolean checkIfPalindrome(String s) {
//		A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.
	    int left = 0;
	    int right = s.length() - 1;
	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}
}
