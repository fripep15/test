package JavaReviewDay07;

import java.util.Scanner;

public class WhileLoopTask3 {

	public static void main(String[] args) {

	     //	Task One	
		// print only even numbers from 1 to 20 */
		int a=1;
		while(a<21) {
	if(a%2==0) {
		System.out.println(a);
				
			}
	a++;
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//Task Two
		//how to print numbers from 5 to 25 inclusive all in 1 line with space in between?
		 
int b=5;
while (b<25) {
	
System.out.print(b +" ");
b++;	 
		 
}	 

System.out.println("//////////////////////////////////////////////////////////");
//Task Three 

//Prompt the user to ask the name 3 times and print "Hello____" 
Scanner scan=new Scanner(System.in);
String name;
int c=1;
while(c<=3) {
	System.out.println(" Print your name");	
	name=scan.nextLine();
	System.out.println("Hello" + name);
	c++;
}
	}

}
