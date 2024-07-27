package com.atul.searching.linearSearch;

public class LinearSearchString {
	public static void main ( String[] args ) {
		String str = "geekforgeeks";
		char target = ' ';

		System.out.println(linearSearch1(str, target) ?
				"Target character found in the String" :
				"Target character isn't present in the String");
		System.out.println(linearSearch2(str, target) ?
				"Target character found in the String" :
				"Target character isn't present in the String");
	}

	/*
	* This block of code searches for the target character in the string and returns
	* 1. true if the character is present in it
	* 2. false if the character is not present
	* */
	public static boolean linearSearch1 ( String str, char target ) {
		if ( str.isEmpty() ) { // returns false if the string is empty
			return false;
		}

		/*
		* Iterating through each character in the String and finding the match for target character
		* returns true if the target is found
		* */
		for ( int i = 0; i < str.length(); i++ ) {
			if ( target == str.charAt(i) ) {
				return true;
			}
		}

		// if this statement is executed that means the target was not present in the string
		return false;
	}

	/*
	* This block of code searches for the target within the converted character Array and returns
	* 1. true if the match is found
	* 2. false if the match isn't found
	* */
	public static boolean linearSearch2 ( String str, char target ) {
		if ( str.isEmpty() ) { // check and return false if the string is empty
			return false;
		}
		/*
		* Looping through the String by converting it to a character array with the help of enhanced for loop
		* returns true if the match is found within it
		*/
		for ( char ch : str.toCharArray() ) {
			if ( target == ch ) {
				return true;
			}
		}

		// if this statement is executed that means the match isn't found and hence we will return false
		return false;
	}
}
