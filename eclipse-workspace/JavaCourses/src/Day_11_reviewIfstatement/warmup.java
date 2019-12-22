package Day_11_reviewIfstatement;

public class warmup {
/* warm up:
 1. declare an int varaible "Year"
 2. write a java program that can check if the year is a leap
 if a year can be divided by 4 ==> leap
 donot use single If statement
 2. grade calculator
 A => 90~100
 B => 80~79
 C => 70~69
 D => 60~59
 F => 0~59
  */
	
	public static void main(String[] args) {
		 int Year = 2000; // it will be leap year becuz it can be divided by 4
		 boolean leapYear = Year %4 ==0; // there should not be a remainder
		 
		 if(LeapYear) {
			 System.out.println(" Year "+ Year+" is leap year");
		 }
		 else {
			 System.out.println(" Year "+Year+" is no leap year");
		 }
	}
}
