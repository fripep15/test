package Day_04;

public class NestedIf {
	
    public static void main(String[] args) {
	
    	//TASK No.1
    	/*Write a program to store a boolean value of whether user has diploma or not.
    	 *  If user has a diploma, you should say congratulations, otherwise program should 
    	 *  suggest to get a degree. Then if user has a degree program should check a gpa score. 
    	 *  If gpa score is higher or equals to 3.5 ---> output should say “You are eligible for scholarship”,
    	 /*   otherwise--->“You should have studied harder” . 
    	  * 
    	  */
    	
	boolean diplo=false;
	double gpa=3.6;
	
	if (diplo) {
		System.out.println("Congratulations");
	}else {
		System.out.println("You  should get a degree");
	}
	if(gpa>=3.5) {
		System.out.println(" You are eligible for scholarship");
	}else {
		System.out.println("You should have studied harder");
	}
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	/*
	 * Create a Java program and store values of mortgage rate and mortgage price.
	 *  First, program should check if rate is higher than 4.5 user will not buy a house, 
	 *  otherwise user will consider buying. Once user decides to buy a house,
	 *   if price of the house is larger than 200000 than user will take a loan, 
	 *   otherwise user will pay cash.
	 */
	
	double numRate=4.5;
	int numPrice=200000;
	if (numRate>4.5) {
		System.out.println("User will not buy a house");	
	}else {
		System.out.println("User will consider buying a house");
	}
	if (numPrice>200000) {
		System.out.println("User will take a loan");
	}else {
		System.out.println("User will pay cash");
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	//TASK NO.3
	int time=8;
	
	if(time<10) {
		System.out.println("Good morning");
		
	}else if (time<=20) {
		System.out.println(" good evening");
	}else {
		System.out.println(" good night");
	}
}
}
