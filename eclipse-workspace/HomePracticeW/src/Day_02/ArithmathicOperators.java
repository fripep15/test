package Day_02;

public class ArithmathicOperators {

	public static void main(String[] args) {
		///TASK1
		//declare two variables and initialize them
		//display result of addition, subtraction, multiplication and division
		
// we can do these arithematic operations by two ways
		
		// FIRST WAY
		int num1, num2;
		num1= 12;
		num2=4;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num2/num1);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");	
		// SECOND WAY
		int add=num1+num2;
		int sub=num1-num2;
		int multp=num1*num2;
		int divid=num2/num1;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multp);
		System.out.println(divid);
		
	
		//Question: how can we print value of num1 and num2 together, it will show 20,10
		// ans: add "," in the middle of both numbers then it will print 20,10, if you dont want, 
		//then remove comma 
		//from double quotes, then it will show a SPACE between both numbers such as 20 10
		System.out.println("/////////////////////////////////////////////////////////////////////");
		//TASK2
		//to add, subtract, multiply and divide 2 decimal values. Your program should say. 
		//“The _______ of 2 numbers ___ and ___ is equal to _____”
		
		double a=2.2;
		double b=4.4;
		
		double sum= a+b;
		double subt=b-a;
		double mult=a*b;
		double divi=b/a;
		System.out.println("The sum of 2 numbers is "+ sum+ " and  multiplication is equal to "+ mult);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		//TASK03
		//// Exercise:  Write a program to find the square of the number 3.9.
		//You program should say “The square of the__ is ____, which is A
		double x=3.9;
		double sqx=x*x;
		System.out.println(" the square of the "+ x + " is "+ sqx+ " , which is A.");
		
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		//TASK04
		// Write a program to print the area and  parameter of a rectangle  with width = 5 and 
		// height = 8. Your program should say. “The parameter of rectangle with width ___ and height ____ 
		//is equal to _____and the area is __”
		
		int width=5;
		int height=8;
		int area=width*height;
		int paramt=2*area;
		System.out.println(" The parameter of a rectangle with width "+ width+ " and height "+ height+
				" is equal to "+ paramt);	
	}

}
