package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		
		/*
		 * Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
        

Create an array of countries. While retrieving all values from an array
 print capital for each country. (use 2 different loops).
		 */
	
		String [] cars= {"toyota" , "carolla", "Suzukia", "Honda", "Kia"};
		for (String ar:cars) {
System.out.println(ar);
	}
		
		// Create an array on integers and calculate the sum of all elements in an array.

		int[] num= {2,4,6};
        int sum=0;
        for(int n:num) {
            sum+=n;
        }
        System.out.println(sum);

	
	//TASK3
    
      String [] country= {"Germany", "USA", "Canada", "Turkey"} ;
    	  
    
    for(String c:country) {
        switch(c) {
        case "Germany":
            System.out.println("The capital of Germany is Berlin");
            break;
        case "USA":
            System.out.println("Washington DC");
            break;
        case "Canada":
            System.out.println("Ottowa");
            break;
        case "Turkey":
            System.out.println("Ankara");
            break;
        }
    }
}
}


