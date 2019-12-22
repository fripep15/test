package Day06_Arithematic;

public class PrimitivesCasting {

	/*
	 casting: converting larger primitives into smaller size
	 primitves: byte, short, int, long, foalt, double
	 
	*/

	
	public static void main(String[] args) {
		
		int a= 10;
		byte b = (byte) a; // explicit casting
		System.out.println(b);
		
		double DecimalNumber= 10.5;
		float FloatNumber = (float) DecimalNumber; //no becuz double > float
		// FloatNUmber =10;
		
		System.out.println(FloatNumber);
		
	long longNum = 300L;
	
	// int IntNum = (int)LongNum;
	int IntNum = (short)longNum;
	System.out.println( IntNum);
	
	// implicit casting:
	byte ByteNum = 100;
	int Num2 = ByteNum;
	// same with:
	int IntNum3 = (int) ByteNum;
	
	short SHortNum =100;
	long LongNum2 = SHortNum;
	
	// same with:
	long LongNum3 = (long) SHortNum;
	
	// expilicit casting:
	double LargestNumber = 100.876;
	
	byte ByteValue = (byte) LargestNumber;
	// 100
	float FloatValue = (byte)LargestNumber;
	System.out.println(ByteValue);
		
	float FloatNumber2 =500.67F;
	int myNumbber = (short)FloatNumber2;
	
	System.out.println(int) FloatNumber;
	
	// 500

	
			
	
	
	
	
		
		
		
				
	}

}
