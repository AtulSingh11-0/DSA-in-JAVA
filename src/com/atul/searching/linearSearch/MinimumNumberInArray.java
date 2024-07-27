package com.atul.searching.linearSearch;

public class MinimumNumberInArray {
	public static void main ( String[] args ) {
		int[] arr = new int[] {24, 65, -3, 0, 93, -1, 101, 54, -39, 38};
		System.out.println(min(arr));
	}

	/*
	* This method searches for the minimum element in the array and returns it
	* */
	public static int min ( int[] arr ) {
		int min = Integer.MAX_VALUE; // storing MAX_VALUE of integer in min variable
		for ( int num : arr ) {
			min = Math.min( min, num ); // comparing each number with the min variable, if num is small then min is updated
		}
		return min; // min is returned after the iteration is done
	}
}
