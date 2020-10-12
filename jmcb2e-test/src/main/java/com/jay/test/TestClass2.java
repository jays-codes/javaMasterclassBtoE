package com.jay.test;

public class TestClass2 {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String[] helloWorld = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
		int count = count(helloWorld, "l");
		
		System.out.println("#occurrences of l: " + count);
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
