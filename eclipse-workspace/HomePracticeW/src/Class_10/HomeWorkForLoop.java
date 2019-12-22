package Class_10;

public class HomeWorkForLoop {

	public static void main(String[] args) {
	// print the following
	/*55555
	 *4444
	 *333
	 *22
	 *1
	 */

		for (int a=5; a>=1; a--) {
			for (int b=1; b<=a; b++){
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
