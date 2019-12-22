package Class_10;

public class NestedLoopPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			for (int a = 0; a <= 5; a++) {
				System.out.println(a);

			}
		}
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		for (int i = 0; i <= 5; i++) {
			for (int a = 0; a <= 5; a++) {

				System.out.println(i + " " + a);
			}
		}
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		for (int i = 0; i < 24; i++) {
			for (int a = 0; a < 59; a++) {
				if (i<10 && a < 10) {
					System.out.println(i + "0:0" + a);
				} else {
					System.out.println(i + ":" + a);
				}
			}
		}
	}
}
