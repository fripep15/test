package Day_06;

import java.util.Scanner;

public class HomeWorkPractice {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * ﬁnal scores) and determine the grade based on the following rules: ● if the
		 * average score >=90 → grade=A ● if the average score >= 70 and <90 → grade=B ●
		 * if the average score>=50 and <70 → grade=C ● if the average score<50 →
		 * grade=F
		 */
		int quiz, midTerm, finalScores, average;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please eneter your quiz score");
		quiz = scan.nextInt();

		System.out.println(" Please enter your midTerm score");
		midTerm = scan.nextInt();

		System.out.println("Please enter your finalScore");
		finalScores = scan.nextInt();

		average = (quiz + midTerm + finalScores) / 3;
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 70 && average < 90) {
			System.out.println("B");
		} else if (average >= 50 && average < 70) {
			System.out.println("C");
		} else if (average < 50) {
			System.out.println("F");
		} else {
			System.out.println(" Unknown");
		}
		
		
		
		
	}
}
