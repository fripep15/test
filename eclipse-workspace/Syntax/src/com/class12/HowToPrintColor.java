package com.class12;

public class HowToPrintColor {

	public static void main(String[] args) {
		
		// print error, means the else is not your required result, then change the out by err.
		//this will print it in red color, will be helpfull in real work.
		int a=30;
		
		if(a==20) {
			System.out.println("Number is "+ a);
			
		}else {
			System.err.println("Number was not 20 but is"+ a);
			
		}

	}

}
