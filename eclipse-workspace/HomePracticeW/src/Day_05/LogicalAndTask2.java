package Day_05;

public class LogicalAndTask2 {

	public static void main(String[] args) {
		/*if number is between 1-10---- this number is small, if number is between
		 * 10-100---- this number is medium, if number is between 100-1000---- this
		 * number is large, any other number is ----- is out of range
		 */
		int num=800;
		if (num>=1 && num<=10) {
			System.out.println(" This number is SMALL");
		}else if(num>=10 && num<=100) {
			System.out.println(" This number is MEDIUM");
		}else if (num>=100 && num<=1000) {
			System.out.println("This number is LARGE");
		}else {
			System.out.println("The number if Out of RANGE");
		}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++");	
		int numa=1003;
		if ( numa>=1 && numa<=10) {
			System.out.println("The Number is Small");
		}else if (numa>=10 && numa<=100) {
			System.out.println(" The number is Medium");
		}else if(numa>=100 && numa<=1000) {
			System.out.println(" The number is Large");
		}else {
			System.out.println(" The number is out RANGE");
		}
	}
}
