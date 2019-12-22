package Class_10;

public class PrintingPattern {

	public static void main(String[] args) {
		// Lets print the following pattern
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
	for (int a=1; a<=5; a++) {
		for (int b=1; b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
for (int c=4; c>=1; c--) {
	for (int d=1; d<=c; d++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
