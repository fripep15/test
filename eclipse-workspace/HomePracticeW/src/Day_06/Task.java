package Day_06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 boolean isSunny;
		  int isTemp;
		 
		  
		 System.out.println("It is a sunny day, I should go somewhere!");
		  isSunny=scan.nextBoolean();	
		 
		  if(isSunny){
			      
			  System.out.println("What is the temprature?");
			  isTemp=scan.nextInt();
					  if (isTemp>=85){
					    System.out.println("I am going to the beach");
					    
					  }else{
					    System.out.println("I am going to the park");
					  }
		  }else{
			   
		  System.out.println("I stay home and practice Java");
		  }
	}
		}
