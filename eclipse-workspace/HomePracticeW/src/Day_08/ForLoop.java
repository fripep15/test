package Day_08;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Say Good Morning 5 times

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("Hallow Guys, Good Morning to all");
		}
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		// // print numbers from 1 to 10

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		//// // print number from 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
		// TASK 1 print numbers form 1 to 100 in one line
		for (int b = 1; b <= 100; b++) {
			System.out.print(b + " ");
		}
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		// TASK 2 print numbers from 100 to 1

		for (int c = 100; c >= 1; c--) {
			System.out.println(c);
		}
		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

		// TASK 3 print even numbers from 20 to 1(2 ways)
		// FIRST WAY

		for (int d = 20; d >= 1; d--) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
			
		}
		// SECOND WAY
		for (int d=20; d>=1; d-=2) {
			System.out.print(d+ " ");
		}
	}
}
