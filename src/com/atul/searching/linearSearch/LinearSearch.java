package com.atul.searching.linearSearch;

public class LinearSearch {
	public static void main ( String[] args ) {
		int[] arr = new int[] {24, 65, -3, 0, 93, -1, 101, 54, -39, 38};
		int target = 0;

		resultPrinter ( linearSearch1(arr, target) );
		resultPrinter ( linearSearch2(arr, target) );
		resultPrinter ( linearSearch3(arr, target) ? 1 : -1 );
	}

	/*
	* This method prints the result of the linear search
	* checks according to the result and prints if the target is present in the array or not
	* */
	public static void resultPrinter ( int result )  {
		if ( result == -1 || result == Integer.MAX_VALUE ) {
			System.out.println("Target not found in the array");
		} else {
			System.out.println("Target found in the array");
		}
	}

	/*
	* Linear search code which checks for the target in the array and returns 
	* 1. the index(1 based indexing) if its present in the array.
	* 2. -1 if it's not present in the array.
	* */
	public static int linearSearch1 ( int[] arr, int target ) {
		if ( arr.length == 0 ) { // if length of the array is 0 then, searching operation can't be performed in it
			return -1;
		}

		/*
		* We will run a for loop starting from the 0th index till arr.length-1 and return the index + 1
		* if the target is found in the array
		* */
		for ( int i = 0; i < arr.length; i++ ) {
			if ( target == arr[i] ) {
				return i+1;
			}
		}

		/*
		* obviously this line will be executed when the target isn't found in the array
		* hence -1 will be returned, which means that the target is not present in the array
		* */
		return -1;
	}

	/*
	* This block of code also searches for the target in the array, but it returns
	* 1. the element itself its it's found
	* 2. Integer.MAX_VALUE if the target isn't found
	* */
	public static int linearSearch2 ( int[] arr, int target ) {
		if ( arr.length == 0 ) { // checks and return MAX_VALUE if length of the array is 0
			return Integer.MAX_VALUE;
		}

		// Iterating over every element in the array to match with the target and return the element itself
		for ( int element : arr ) {
			if ( element == target ) {
				return element;
			}
		}

		/*
		* This line is executing means the for-loop couldn't find the target in the array
		* so, we need to return Integer.MAX_VALUE. because if we return -1, it can also be an element in the array
		* resulting in conflict
		* */
		return Integer.MAX_VALUE;
	}

	/*
	* This block of code also searches for the target in the array, but it returns
	* 1. true if the target is found
	* 2. false if the target isn't found
	* */
	public static boolean linearSearch3 ( int[] arr, int target ) {
		if ( arr.length == 0 ) { // if length of the array is 0, then return false
			return false;
		}

		// Iterating through the array and returning true if the target is matched with the elements
		for ( int element : arr ) {
			if ( element == target ) {
				return true;
			}
		}

		// this line is executing means the target isn't in the array and hence we need to return false
		return false;
	}
}
