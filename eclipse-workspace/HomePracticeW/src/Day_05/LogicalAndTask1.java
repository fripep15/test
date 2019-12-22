package Day_05;

public class LogicalAndTask1 {

	public static void main(String[] args) {
		/*
		 * if number is between 1-10---- this number is small, if number is between
		 * 10-100---- this number is medium, if number is between 100-1000---- this
		 * number is large, any other number is ----- is out of range
		 */
int num=999;
if( num>=1 && num<10) {
	System.out.println(" This number is small");
	
}else if (num>=10 && num<100) {
	System.out.println(" This number is medium");

}else if (num>=100 && num< 1000) {
System.out.println(" This number is Large");

	} else {
		System.out.println(" The number is out of range");
	}
}
}
