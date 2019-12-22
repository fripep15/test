package Day_05;

import java.util.Scanner;

public class LogicalTask {

	public static void main(String[] args) {
		/* ask user to enter daily sales 
		* based on the sales range we want to give commission to the person
		* if sales is <100 --> commission is 10%
		* if sales is between 100 -200 --> commission of 20%
		* etc...
		 */
		double sales=50;
		double commission=5;
		
Scanner scan=new Scanner(System.in);
System.out.println("Enter you daily sales");
double num=scan.nextDouble();
if (sales>1 && sales<=100) {
	//System.out.println("you will get 10% commission");
	commission=sales*0.1;
	
}else if (sales>100 && sales<=200 ) {
	//System.out.println("you will get 20% commission ");
	
	commission=sales*0.2;
	
}else if (sales>200 && sales<=500) {
	//System.out.println(" you will get 30% commission");
	
	commission=sales*0.3;
	
}else if (sales>=500){
	//System.out.println(" you will get 50% commission");
	
	commission=sales*0.5;
}else {
	commission=0;
}
System.out.println("Based on sales your commmission is "+commission);
	}

}
