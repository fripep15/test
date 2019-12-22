package Day08;

public class RelationationanlOperators {
	
		/*
		 * These operators returne Boolean Expressions
		 > : Greater than, 
		 >= :Greate tha OR Equal,
		 <: Smaller/ less than,
		 <=: Smaller/less tah OR Equal,
		 ==: Equal,
		 !: mean logical opposite
		 
		 */

        public static void main(String[] args) {
			
        	System.out.println( 10 > 9);// true
        	boolean resultA = 10 > 9;
        	System.out.println( resultA);
        	
        	System.out.println( 10>= 9);//  greater or equal/ at least one condition should meet
        	// i.e either greater or shuould be equal in that case it show TRUE
        	
        	boolean resultB = 10>= 9;
        	System.out.println(resultB);// true
        	
        	boolean resultC = 10 <=9;// false
        	
        	boolean resultD = 1100 < 1200; // less than
        	System.out.println(resultD);// True
        	
        	boolean resultE = 1000 < 1000;
        	System.out.println( resultE);// True
        	
        	boolean resultF = 1000 <= 1000; // less than or equal to
        	System.out.println(resultF);/// True
        	
        	// ==: Equal
        	
        	boolean resultG = 19 == 19; // equal
        	System.out.println(resultG);// true
        	
        	//!: Opposite
        	
        	boolean resultH = 20 !=20; //Opposite
        	System.out.println(resultH);// true
        	
        	boolean A = ! fale; // true
        	System.out.println(A);
        	
        	boolean B = !true; // false
        	
        	/*
        	 in java:
        	 true == true, false == false
        	 !false equal to true, !true equal to false
        	 so therefore
        	 !false does not equal to !true
        	 and
        	 true equal to !false
        	 */
        			boolean C = !false !=true;
        			System.out.println(C);
        			
        			boolean D =true == !false;
        	
        	
        
		}
}
