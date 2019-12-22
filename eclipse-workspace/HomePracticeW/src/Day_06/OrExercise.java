package Day_06;

import java.util.Scanner;

public class OrExercise {
	public static void main(String[] args) {
		/*
		 * ask user to enter the month they were born based on the month define the
		 * season if user is born in Jan, feb and dec winter if born in march, April,
		 * May spring if born in june, july, August summer
		 *  if in Sept, Octo and Nove falls 
		 *  otherwise its unknown at the end of
		 * program" you were born in"
		 */
		Scanner scan = new Scanner(System.in);
		String month = "Jan";
		System.out.println(" Which month of the year you were born");
		month = scan.nextLine();
		String seasonOfYr;
		if (month.equals("Jan") || month.equals("Feb") || month.equals("Dec")) {
			seasonOfYr = "winter";
		} else if (month.equals("Mar") || month.equals("Apr") || month.equals("May")) {
			seasonOfYr = "Spring";
		} else if (month.equals("Jun") || month.equals("Jul") || month.equals("Aug")) {
			seasonOfYr = "summer";
		}else if (month.equals("Sep") || month.equals("Oct")|| month.equals("Nov")) {
			seasonOfYr="fall";
		}else {
			seasonOfYr="Unkown";
		}
		System.out.println(" You were born in "+seasonOfYr);
	}
}
