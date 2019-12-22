package Class_10;

import java.util.Scanner;

public class NestedLoopHomeWork {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter start number");
		int startNumber = scan.nextInt();
		System.out.println(" Enter end number");
		int endNumber = scan.nextInt();

		int even = 0;
		int odd = 0;

		int start;
		for (int i = startNumber; i <= endNumber; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("The sum of even numbers is "+ even);
		System.out.println("The sum of odd numbers is "+ odd);
	}

}
