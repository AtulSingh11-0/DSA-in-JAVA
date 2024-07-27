package com.atul.searching.linearSearch;

public class MaximumIn2DArray {
	public static void main ( String[] args ) {
		int[][] arr = new int[][] {
				{105, 213, 347},
				{452, 578, 681, 724, 899},
				{135, 612},
				{255, 374, 488, 905}
		};

		System.out.println(max(arr));
	}

	/*
	* This method searches for the maximum element within the 2-D array and returns it
	* */
	public static int max ( int[][] arr ) {
		int max = Integer.MIN_VALUE; // initializing variable max with MIN_VALUE
		for ( int[] array : arr ) {
			for ( int element : array ) {
				max = Math.max( max, element ); // updating variable max with the maximum element encountered in the array
			}
		}
		return max; // returning the maximum element
	}
}
