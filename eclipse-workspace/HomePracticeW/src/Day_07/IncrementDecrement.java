package Day_07;

public class IncrementDecrement {

	public static void main(String[] args) {

		int a = 10;
		a = a + 1;// assignment
		a += 1;// short hand
		System.out.println(a);/// will print 12

		a++;// this is called increment operator
		System.out.println(a);// will print 13 because the value of a is taken from above step where value of
								// a was 12

		int b = 10;
		b -= 1;
		b--;// decrement operator
		System.out.println(b);// 8, because value of b was 10 but deducted by 1 in the above step and now
								// further
								// decremented to 8

		// lets print numbers from 1 to 20
		int i = 1;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		System.out.println("/////////////////////////////////////////////////");

// print numbers from 10 to 30, all in one line
		int x = 10;
		while (x <= 30) {
			System.out.print(x);
			x++;
		}
		System.out.println("*****************************************************");
		// print values from 50 to 20

		int z = 50;
		while (z >= 20) {
			System.out.println(z);
			z--;

		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// print all even numbers form 1 to 20
		// First way;
		int q = 2;
		while (q <= 20) {

			System.out.println(q);
			q += 2;

		}
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		// Second Way
		int d = 1;
		while (d <= 20) {
			d++;
			if (d % 2 == 0) {
				System.out.println(d);
			}		
		}
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		// Task for EVEN: print odd numbers from 1 to 100
		
		//Task for Odd:print add numbers from 50 to 100
		
		int odd=1;
		while(odd<=100) {
			if (odd%2!=0) {
				System.out.println(odd);
			}
			odd++;
		}
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
		int even=50;
		while(even<=100) {
			if(even%2==0) {
				System.out.println(even);
			}
			even++;
		}
	}
}
