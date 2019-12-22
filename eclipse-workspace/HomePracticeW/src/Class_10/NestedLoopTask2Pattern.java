package Class_10;

public class NestedLoopTask2Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			// for (int j = 1; j <= 5; j++) {
			System.out.print("*");// it will print the star 25 times in a straight line
		}
		System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");

		// if we want to print 5 stars in one line but 5 times, because the iteration
		// will be done 5 times
		// so we can repeat the loop five times
		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");

		}
		// this is very lenthy and time comsuming way, we can do the same through a
		// simple and easy way
		// through Nested loop, see the following method
		System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

		for (int a = 1; a <= 4; a++) { // this shows number of rows
			for (int b = 1; b <= 5; b++) { // this shows number of columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

		for (int a = 1; a <= 10; a++) { // this shows number of rows
			for (int b = 1; b <= 10; b++) { // this shows number of columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

		for (int e = 1; e <= 15; e++) {
			for (int d = 1; d <= 5; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
		
		// lets print
		// 12345
		// 12345
		// 12345
		// 12345

		for (int r = 1; r <= 3; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		
		// lets print
		//11111
		//22222
		//33333
		//44444
		//55555
		
		for (int g=1; g<=5; g++) {
			for (int h=1; h<=5; h++) {
				System.out.print(g+h);
			}
			System.out.println();
		}
		System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
		// lets print 123456789 9 times
		for (int k=1; k<=5; k++) {
			for(int l=1; l<=9; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
		// print 54321 5 times
		for (int z=1; z<=5; z++) {
			for(int x=5; x>=1; x--) {
				System.out.print(x);
			}
			System.out.println();
		}
		System.out.println("11111111111111111111111111111111111111111111111111111111111111111111111111111111");
		
		// lets print
		//55555
		//44444
		//33333
		//22222
		//11111
		for (int n=5; n>=1; n--) {
			for(int m=1; m<=5; m++) {
				System.out.print(n);
			}
			System.out.println(n);
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		// lets try to print 
		// *****
				// *
				// **
				// ***
				// ****
		for (int t=1; t<=5; t++) {
			for (int y=1; y<=t; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		// pets print
		//1
		//12
		//123
		//1234
		//12345
		
		for (int u=1; u<=5; u++) {
			for (int i=1; i<=u; i++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		
		// lets print
		//1
		//22
		//333
		//4444
		//55555
		//666666
		//7777777
		//88888888
		//999999999
		for (int o=1; o<=9; o++) {
			for(int p=1; p<=o; p++) {
				System.out.print(o);
			}
			System.out.println();
		}
	}
}
