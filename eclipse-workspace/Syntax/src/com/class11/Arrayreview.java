package com.class11;

public class Arrayreview {
	public static void main(String [] args) {
		
		int [] array=new int[6];
		array[0]=33;
		int [] numberList= {2,3,5,7};
		
//		for (int i = 0; i < numberList.length; i++) {
//			System.out.println(numberList [i]);
		
			for (int ar:numberList) {
				System.out.println(ar);
			}
		}
	}


