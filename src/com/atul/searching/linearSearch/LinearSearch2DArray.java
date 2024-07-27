package com.atul.searching.linearSearch;

import java.util.Arrays;

public class LinearSearch2DArray {
	public static void main ( String[] args ) {
		int[][] arr = new int[][] {
				{105, 213, 347},
				{452, 578, 681, 724, 899},
				{135, 612},
				{255, 374, 488, 905}
		};
		int target = 612;

		System.out.println(Arrays.toString(linearSearch1(arr, target)));
		System.out.println(linearSearch2(arr, target));
	}

	/*
	* This method searches for the target withing the 2-D array and returns
	* 1. an array consisting of the rows and columns (1-based indexing) if target is found
	* 2. an array consisting of [-1, -1] if target isn't found
	* */
	public static int[] linearSearch1 ( int[][] arr, int target ) {
		if ( arr.length == 0 ) { // returns [-1, -1] if length of the array is 0
			return new int[] {-1, -1};
		}

		/*
		* Iterating through each element in their respective array's in the 2-D array and search for the target
		* returns an array consisting of the rows and cols of the found target
		* */
		for ( int row = 0; row < arr.length; row++ ) {
			for ( int col = 0; col < arr[row].length; col++ ) {
				if ( arr[row][col] == target) {
					return new int[] {row+1, col+1};
				}
			}
		}

		// if this statement is executed that means the target isn't found in the array
		return new int[] {-1,-1};
	}

	/*
	* This method searches for the target in the 2-D array and returns
	* 1. true if the target is found
	* 2. false if the target isn't found
	* */
	public static boolean linearSearch2 ( int[][] arr, int target ) {
		if ( arr.length == 0 ) { // check and return false if size of array is 0
			return false;
		}

		/*
		* Iterating through each element's within the array's in the 2-D array
		* return true if target is encountered
		* */
		for ( int[] array : arr ) {
			for ( int num : array ) {
				if ( num == target ) {
					return true;
				}
			}
		}

		// if this statement is getting executed that means the target isn't found in the array
		return false;
	}
}
