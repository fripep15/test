package com.class12;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {

int [] array2= {1,2,3,4,5};
for (int i:array2) {
	
	System.out.println(i);
	

int [] arr=new int[3];
Scanner scan=new Scanner(System.in);

    for (i=0; i<arr.length; i++) {
	arr[i]= scan.nextInt();
    }
for (int i=0; i<arr.length; i++) {
	System.out.println(arr[i]+ " ");
}
	}
}
	}


