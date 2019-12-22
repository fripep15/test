package Day07;

public class UnerayOperators {

	public static void main(String[] args) {

		
		 /*
		  
		  +: positive
		  -: negative
		  + +: increment
		  - -: decrement
		  + -: +
		  + +: +
		  
		  */
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = + b; // + (-10) = 10
		int d = -c; // - (-10) = 10
		System.out.println(d);
		
		int f = - (10);
		
		// increment: two types
		// 1 pre increment:operators are placed before the variables. it increases the value by 1 immediately
		int num1 = 100;
				
		System.out.println(++num1); //++ num1 means num1+1
		// 2. post increment:opertors are placed after the operators 
		
		// post increment: operator is placed after the variable
		//                 
		int IntNum = 100;
		System.out.println(IntNum ++);// 100, in first step gives the current value in next step adds 1
		System.out.println( IntNum);// 101
		
		int IntNum2 = IntNum ++; // IntNum2 = 101
		// IntNum2 = 101
		System.out.println( IntNum2);// 101
		 System.out.println( IntNum);// 102
		 
		 int x= 100;
		 int y = x++ - 1;
		 // y =100 - 1;// 99
		 
		System.out.println(y);
		
		//decrement : decreases the value by 1
		// two types: 1. pre decrement: operator is placed before the variable
		// values is decreased by 1 immediatly
		int Z= 100;
		System.out.println(-- Z);// 99
		
		System.out.println();
	
		// and 2. post decrement: operator is placed after the variable
		// it will passs the current value and then decrease by 1
		int Y= 95;
		System.out.println(Y --);// 95
		System.out.println(Y);// 94
		
		int T =25;
		System.out.println(++T);//26
		System.out.println(--T);//25
		
		int P =50; // 49
		P = --P + P++ + P-- + P ++;
		// pre    post   post  post
		// 49  +  49  + 50  + 49
		// 98 + 50 + 49 = 197
		// 
		System.out.println(P);
		
		short Snum =4;
		int R = Snum * 4 - Snum --;
		
		
	// 
		int a1 = 1;// 1
		//a = -a-- + a++ / -a-- * --a;
		//a = -1-- + 1++ / -1-- * --1;
		// a=  post + post / post * pre
	
		// a= 	-1 - 1 / 1 * 2
		//a1=   -1 - 1 * 2
	
				
		
		
		
		
		
		
		
		
		
	}
}