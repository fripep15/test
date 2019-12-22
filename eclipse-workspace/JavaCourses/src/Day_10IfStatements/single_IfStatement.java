package Day_10IfStatements;

public class single_IfStatement {

	public static void main(String[] args) {

		/*
		 * single if: if (boolean expression) { //A }
		 */

		if (9 > 8) {
			// true
			System.out.println("9 is greatre than 8");
		}

		if (9 < 8) {

			// false, it will not be printed by the system because the condition is false
			// it will only print when the condition is true.
			System.out.println(" 8 is gretare than 9");
	     	}

			// Task No.01:
			int num1 = 100;
			int num2 = 300;
			int max = 0; // local variables needs to be initialized before use
			if (num1 > num2) { // num1 is greatre than num2
				// false
				// max = num1;
				max += num1;// will not be executed becuz he condition is flase, only true conditions will
							// be executed

				System.out.println(" Maximuum nuber is " + max);

			}
			if (num2 > num1) {

				// 300 > 100 TRUE
				max = num2; //

				System.out.println("Maximum number between " + num1 + "  and " + num2);

				// Task No. 02:

				int hours = 25;
				int minutes = 45;
				int seconds = 30;

			  String  am0rpm = "am";

				System.out.println(hours + ":" + minutes + ":" + seconds + "" + am0rpm);

			}

		}
	}

// if statement by itself:
