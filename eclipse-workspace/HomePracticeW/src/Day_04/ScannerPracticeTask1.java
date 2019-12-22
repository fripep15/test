package Day_04;

import java.util.Scanner;

public class ScannerPracticeTask1 {

	public static void main(String[] args) {
		/*please enter following,
		 * What is your name?
		 * Where do you leave?
		 * Where are you from?
		 * How old are you?
		 * What is your cell phone number?
		 */
Scanner scan=new Scanner(System.in);

System.out.println("is it Raining out side");
boolean num=scan.nextBoolean();

System.out.println(" Plz enter your name?");
String num0=scan.nextLine();

System.out.println("Where are you from?");
String num2=scan.nextLine();

System.out.println("How old are you");
int num3=scan.nextInt();

System.out.println("where do you live");
String num1=scan.nextLine();

System.out.println("What is your cell phone number?");
int num4=scan.nextInt();

System.out.println("Enter your GPA");
double num5=scan.nextDouble();

System.out.println(" whats is your grade");
char num6=scan.next().charAt(0);



System.out.println(num);
System.out.println(num0);
System.out.println(num3);
System.out.println(num2);
System.out.println(num1);
System.out.println(num4);
System.out.println(num5);
System.out.println(num6);
	}

}
