package Day_04;

import java.util.Scanner;

public class ScannerNestedIfTask {

	public static void main(String[] args) {
		
		//Create a Java program and store values of mortgage rate and mortgage price.
		//First, program should check if rate is higher than 4.5 user will not buy a house, 
		//otherwise user will consider buying. Once user decides to buy a house,
		//if price of the house is larger than 200000 than user will take a loan, 
		//otherwise user will pay cash.	
		
		Scanner scan=new Scanner(System.in);
double morgage= 3.5;
int price=300000;

if(morgage>4.5) {
	System.out.println(" User will not buy a house");
}else {
	System.out.println(" User will buy a house");
}
if(price>200000) {
	System.out.println(" user will take loan");
}else {
	System.out.println(" User will pay cash");
}
	}

}
