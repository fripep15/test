package Class_09;

public class Arrrays {

	public static void main(String[] args) {
		// Arrays are used to store multiple values in variable 
		// to declare array, define a variable type with square brackets 
		// e.g 
		// String [] cars;// initializing
		// String [] cars={"Toyota", "Suzuki", "BMW", "GMC"};// assigning values
		
		// int num1 [];// initializing
		// int num1={ 2, 6,13,19};//assigning values
		// to access the elements of array we need to give reference number of an element.
		// in arrays reference starts from 0,1,2,3 and soon
		// if we need the reference of Toyota in following example 
		//then we need to put 0, if need Suzuki we have to put 1, for BMW 3 and so on.
		
		String [] cars= {"Toyota", "Suzuki", "BMW", "GMC",};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		// we can reassign value to any of the reference, for instance in the above example we have
		// reference 0= Toyota, 1= Suzuki, 2=BMW and 3=GMC but we can reassign values as follow,
		cars[0]="Mercedez";
		cars[1]="Jeep";
		cars[2]="Truck";
		cars[3]="Ambulance";
		
		// here we reassigned values now instead of Toyota, Suzuki, BMW and GMC we will get
		// Mercedez,Jeep,Truck and Ambulance
		
		System.out.println(cars[0]);// instead of Toyota it will print Mercedez
		System.out.println(cars[1]);// instead of Suzuki it will print Jeep
		System.out.println(cars[2]);// instead of BMW it will print Truck
		System.out.println(cars[3]);// instead of GMC it will print Ambulance
	}

}
