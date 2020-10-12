package com.jay.assorted;

public class TestClass1 {

	public static void main(String[] args) {		
		String[] helloWorld = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
		int count = count(helloWorld, "l");
		
		System.out.println("#occurrences of l: " + count);
		
		Integer[] integers = {1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0};
		count = count(integers, 0);
		System.out.println("#occurrences of zeros: " + count);
	}
	
	public static <T> int count(T[] arr, T item) {
		int count = 0;
		
	    if (item == null) {
	        for (T s : arr) {
	            if (s == null) count++;
	        }
	    } else {
	        for (T s : arr) {
	            if (item.equals(s)) {
	                count++;
	            }
	        }
	    }
		
		return count;
	} 
	
}
