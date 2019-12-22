package com.class11;

import java.util.Arrays;

public class TaskSolution {

	public static void main(String[] args) {
		
		String [] actualNames= {"John", "Smith", "Alex", "Tanaz"};
        String [] expectedNames= { "Smith","John", "Alex", "Tanaz"};
// to sort elements of array
        
        Arrays.sort(expectedNames);
System.out.println(Arrays.toString(actualNames));
        
        String actual= Arrays.toString(actualNames);
        String expected= Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
        
        String firstNames="Zom";
        String firstName2="Ali";
        
        String firstNames3="Ali";
        String firstName4="Zom";
        
        String actl= firstNames+firstName2;
        String expt= firstNames3+firstName4;
        
        System.out.println(actl);
        System.out.println(expt);
    }
}
