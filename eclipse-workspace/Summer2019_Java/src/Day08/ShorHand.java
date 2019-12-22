package Day08;

public class ShorHand {
	
	/* 
	 *+ = addition asssigment: x+y= x=x+y
	 - = subtraction
	 *= Multiplication assigment : x *= y ==> x= x*y
	/= division assigment : x/=y ==> x= x/y
	% = Remainder assigment: x %= y  ==> x %=y;
	
	 
	 */
	
	public static void main(String[] args) {
		
	
		int a = 9;
		a = a+3;// 12
		
	a += 3; // a = a+3
		System.out.println();
		
		double b = a +=5;
				// 12 + =5  ==> 12+ 5= 17 a ==> 17
		System.out.println(b);
		//a = 17, b= 17
		System.out.println(a);
		
		int c = a+=b;// a = 34, c=34, b= 17
		// 17 + =17 ==>34
		System.out.println(c);// 34
		
		int d = a +=c; //34 +=34
		System.out.println(d);
		
		int e =(d+=b) * 2;
		// e = (68+17)*2 ==> 170
		System.out.println(e);// d = 85, b =70, e =170
		
		System.out.println(d);//85
		System.out.println(c);//34
		System.out.println(b);//17
		
		// d= 85, b= 17, e= 170, c= 34
		
		int f = b+=d*2;
		// b += 170;
		//17 +=170 ==> 187
		System.out.println(f);// b= 187
		
		// - =:
		int g = 101;
		int h = g -=1;
		// 101 -=1 ==>100
		System.out.println(h);
		
		
		int i = g+=h+5;// g= 205, i =205, h=100
		// g+ = 100+5  ==> 205
		System.out.println(i);
		
		int j = h+= g % i; // h = 100, j = 100
		// 100 =205%250
		// 100 = 0
		System.out.println(j);//100
		
		int k = j -=h * 2 % 5;
		// j -=200%5
		// 100 -= 0
		// 100
		System.out.println(k);//100
		
		// *=:
		int A = 100;
		A*=200; // 200*100 ==> A= 20000
		System.out.println(A);//20000
		
		int B =100;
		
		B *= 100/10;
		// B *= 10
		// B= 100 *10==> 10
		System.out.println(B);// 1000
		
		B *= B- 1000;
		
		// B * = (1000 - 1000) = 0
		System.out.println(B);//0
		
		// /=:
		int C = 1000;
		C /=5;
		System.out.println(C);//
		
		int D = 10;
		C /= D-10;
		System.out.println(C);
				C /=D+10;
				System.out.println(C);
		
		
		// %=:
				int Z =10%3; // ==> 3.3335 remainder : 10 - the whole numebr (3) multiply by denominator
				// 10 - 3*3 = 1
				
				// when we divide the number we will have remainder, this is called odd number
				
				int E = 10;
				E%= 2; //E = 10%2 ==>0
				System.out.println(E);
				
				int F =100;
				F %=2; // F = F%2 ==>0
				System.out.println(F);// if it is 0 means even number
				
				System.out.println(-100/3);
				System.out.println(10.5 % 3);
				// 10.5/3= 3, ut remainder will be = 10.5 - 3*3 = 1.5
				
				
				int J = 300;
				int K = 10;
				J += J%K; // 
				System.out.println(J);// 300
	
				
		
		
		
		
		
		
				
				
	}

}
