package Day06_Arithematic;

public class ArithmaticOperators {
	
	/*
	 +: addition, adds two number together
	 -: subtraction, it subtracts number from another number
	 *: multiplication, it multiplies
	 /: division, bbasically divides
	 %: remainder, returns the remander from the division
	 
	 */

	public static void main(String[] args) {
		int a= 100;
		int b= a-400; // -300;
		
		System.out.println(b);
		
		int c = a+b; // 100+ - 300 = -200
		System.out.println(c);
		
		int X = 3, Y = 5, Z= X*Y;
		System.out.println(Z); // 15
		
		double lenght = 100, Wedith = 10,
				Area = lenght*Wedith;
			System.out.println(Area);
			System.out.println( 3+5+4-2); //10
			// 8+4+2= 10
			
	double resultNum = 9/1 ; // denominator can not be zero
	short Number1 = 10/3;
	System.out.println(Number1);
	
	
	// %:
	/*
	 10/3  =  3 with remainder of 1
	 12/5 = 2 with remainder of (12-(5*2) = 2
	 20/3 = 6 : 20 - 6*3 = 2
	 */
	
	int result1 =10%3; //1
	System.out.println(10%3);
	
	/*
	  20, 45, 65, 67, 68
	  
	  even: can be divided by 2 without a remainder
	  odd: divided by 2, will have remiader
	  
	 */
	
	int Number20 = 20 % 2; // even
	int Number45 = 45 % 2;
	int Number65 = 65 %2 ;
	
	System.out.println(Number45);// odd
	System.out.println(Number65); // odd  (65- 34*2) = 1
	
	System.out.println(4+17 % 2-1);
	
	// 4+1-1 = 
	
	
	System.out.println(6 - 3*2 + 7 - 1);
	
	System.out.println( 6 * 3 / 2);
	
	/*
	 first come first serve, except VIP
	 VIP: %, /, *
	 */
	
	System.out.println(1 + 2- 2 + 3);// 4
	System.out.println( 1 + 2 - ( 2 + 3 ) );// 4
	
	System.out.println( 3 + 4 * 4 + 5 * (4 + 3));
	// 3 + 4 * 4 + 5 * 7
	// 3 + 16 + 35
	// 19 + 35 = 54
	
	// %: 
	// 10/4= 2  with remainder of ( 10 - 2 * 4) = 2
	
	System.out.println(10 % 4);
	
	// 4 + 17 
	
	System.out.println( 25 % 10);
	// 21 % 2-1
	// 1 - 1= 
	
	// 5 + 2 * 4= 13
	System.out.println(5 + (2 * 4));// 5 + 8=13
	System.out.println(10/2 - 3);// 5-3=2
	System.out.println(8 + 12 * 2 - 4);// 8 + 24 - 4 = 28
	System.out.println(8 + 17 % 2 - 1);//8 + 1 - 1 = 8
	System.out.println(6 - 3 * 2 + 7 - 1);// 6 - 6 + 7 - 1
	                                      // 13 - 7
	                                      // 13 - 7 = 6
	System.out.println(3 + 4 * 4 + 5 * (4 + 3) - 1);// 53
	System.out.println( (5 + 2) * 4);// 28
	System.out.println( 10/ (5 - 3));//5
	                                 // 10/2 = 5
	System.out.println (8 + 12 * (6 - 2));// 56
	System.out.println ( ( 4 + 17) % 2 - 1);// 0
	System.out.println ((6 - 3 )* (2 + 7) / 3);// 9
	
	//Task: No.1
	int Number46 = 46, Number90 = 90, NumberSum = 136; 
	System.out.println(" Sum " + (46 + 90));// 136
	
	// Task No.2
	// Farenheit F= 9 * C/5 + 32
	int F1 = 40; int C1 = 35;
	
	System.out.println( 9 * C1/5 + 32);// 
	System.out.println((F1-32) * 5/9);// 4
	
	// 1 mile = 1.609344km
	
	double NumKm = 1.609344, NumMile = 18;
	System.out.println(NumMile *NumKm );// 28
	System.out.println( " Distance in Km =" + (NumMile * NumKm));// DIstance in Km 28. 0000
	
	// Task No.3:
	// perimeter = 2 * radius * pie
	// Area = 2 * pie * r (radius in cm)
	
	double NumRadius1= 5.5;
System.out.println( " Area of Circle in cm " + (NumRadius1 * (22/7) * 2));// 33

	
// average of three nummbers 
double Numone = 15, Numtwo = 15, Numthree =15;
System.out.println(( Numone + (Numtwo + Numthre)/3);// 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
		
		
		
				
	}
	
	
}
