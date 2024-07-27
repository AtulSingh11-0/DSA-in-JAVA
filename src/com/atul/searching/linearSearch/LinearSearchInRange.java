package com.atul.searching.linearSearch;

public class LinearSearchInRange {
	public static void main ( String[] args ) {
		int[] arr = new int[] {24, 65, -3, 0, 93, -1, 101, 54, -39, 38};
		int target = 54;

		printResult( linearSearch1(arr, target, 2, 6) );
		printResult( linearSearch2(arr, target, 3, 8) ? 1 : -1 );
	}

	/*
	* This method prints the result of the linear search based on the results
	* */
	public static void printResult ( int result ) {
		if ( result == -1 ) {
			System.out.println("Target not present in the array");
		} else {
			System.out.println("Target found in the array");
		}
	}

	/*
	* This block of codes searches for the target in the array for a specified range and returns
	* 1. index(1-based indexing) of the target from the array if it's present
	* 2. -1 if the target is not present in the array
	* */
	public static int linearSearch1 ( int[] arr, int target, int start, int end ) {
		if ( arr.length == 0 ) { // check and return false if size of array is 0
			return -1;
		}

		// iterate through the array within the specified range and search for the target
		for ( int index = start; index <= end; index++ ) {
			if ( arr[index] == target ) {
				return index+1;
			}
		}

		// if this statement is getting executed that means the element was not present within the specified range
		return -1;
	}

	/*
	* This block of code searches for the target in the array within the specified range and returns
	* 1. true if the target is found
	* 2. false if it's not found within that specified range
	* */
	public static boolean linearSearch2 ( int[] arr, int target, int start, int end ) {
		if ( arr.length == 0 ) { // check and return false if length of the array is 0
			return false;
		}

		// iterate through the array and search for the target within the specified range
		for ( int index = start; index <= end ; index++ ) {
			if ( arr[index] == target ) {
				return true;
			}
		}

		// if this statement is getting executed that means the target wasn't found within the specified range
		return false;
	}
}
