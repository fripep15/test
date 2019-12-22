package Day_06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*HomeWork: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
Scanner scan= new Scanner(System.in);
int num1; 
int num2; 
int total=0;
char optr;

System.out.println(" Please enter first number");
num1=scan.nextInt();
System.out.println(" Please enter operators");
optr=scan.next().charAt(0);
System.out.println(" Please enter second number");
num2=scan.nextInt();
switch(optr) {
case'+':
	total=num1+num2;
	break;
case '*':
	total=num1*num2;
	break;
case '/':
	total=num1/num2;
    break;
case '-':
	total=num1-num2;
	break;
case '%':
	total=num1%num2;
	break;
	
	default:
		System.out.println("wrong operator entered");
	
}
System.out.println(total);
	}

}
