package com.class12;

public class Empty {

	public static void main(String[] args) {
	
		/*
		 *this method checks, withr a string is empty are not
		 *
		 *
		 */
		
		String str="";
		
		System.out.println("Is this string empty= " + str.isEmpty());
		
		String str2="Hello";
		System.out.println("Is this string empty= " + str2.isEmpty());
		
		if (!str.isEmpty()) {
			System.out.println("This is empty");
			
		}else {
			System.err.println("This is not empty string");
			
			// print on two lines with one syso 
			String sentence="Each day has a promise to brighten up the day, \n but first you must allow the sun to your way";
			System.out.println("Each day has a promise to brighten up the day, \n but first you must allow the sun to your way");
		}
	}

}
