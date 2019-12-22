package Day_06;

import java.util.Scanner;

public class TASK1IfAndIfElse {

	public static void main(String[] args) {
		// enter three integers
		// find the largest

		Scanner scan = new Scanner(System.in);
		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble();

		if (no1 > no2) {

			if (no1 > no3) {
				System.out.println(" no1 is the largest number");
			}else {
				System.out.println(" no3 is the largest number");
			}
		}else {
				if(no2 > no3) {
					System.out.println(" no2 is the largest numer");
			}else {
				System.out.println(" no3 is the largest number");
			}
		}
	}
}
