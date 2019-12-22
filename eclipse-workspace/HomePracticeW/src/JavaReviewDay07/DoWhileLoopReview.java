package JavaReviewDay07;

import java.util.Scanner;

public class DoWhileLoopReview {

	public static void main(String[] args) {
	
		int num = 10;
		while (num <= 7) {
		System.out.println("Hello");
		num++;
		}
		// rare
		int num1 = 10;
		do {
		System.out.println("Bye");
		num1++;
		} while (num1 <= 7);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		// print even numbers from 20 to 50 using do while
		// 1 way
		int even = 20;
		do {
		System.out.println(even);
		even += 2;
		} while (even <= 50);
		System.out.println("-------------Second way---------");
		// 2 way
		int even1 = 20;
		do {
		if (even1 % 2 == 0) {
		System.out.println(even1);
		}
		even1++;
		} while (even1 <= 50);
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		 //   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		int z=1;
		do {
			if(z%2==1) {
			System.out.println(z);
			}
			z+=1;	
		}while(z<=15);
		
		Scanner scan=new Scanner(System.in);
		int answer;
		do {
			System.out.println("Pay for candy");
			answer=scan.nextInt();
		}while(answer!=3);
		System.out.println(answer);
		
	}
	
	
	
}
