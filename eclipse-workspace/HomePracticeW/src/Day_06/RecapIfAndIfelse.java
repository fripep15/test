package Day_06;

public class RecapIfAndIfelse {

	public static void main(String[] args) {
		/*
		 * declare then time (1-24) based on the time identify whether it is morning,
		 * afternoon, evening or night if 1-11---morning if 12-3----noon if
		 * 4-8-----evening if >20----night
		 */
		int time = 2;
		String timeOfDay = null;
		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";

		} else if (time >= 12 && time <= 3) {
			timeOfDay = "Noon";

		} else if (time >= 4 && time <= 8) {
			timeOfDay = "Evening";
		} else if (time == 20) {
			timeOfDay = "Night";
		} else {
			timeOfDay = "Not recognized";
		}
		System.out.println(" Time of the day is " + timeOfDay);

		// =========================================================================
		int time1 = 14;
		String dayTime = null;

		if (time1 >= 1 && time1 <= 11) {
			dayTime = "Morning";

		} else if (time1 >= 12 && time1 <= 3) {
			dayTime = "Noon";

		} else if (time1 >= 4 && time1 <= 8) {
			dayTime = "Evening";

		} else if (time1 >= 9 && time1 <= 20) {
			dayTime = "Night";

		} else {
			dayTime = "Invalid";
		}
		System.out.println("Now time of the day is " + dayTime);
	}

}
