package Day_05;

public class LogicalOrTask1 {

	public static void main(String[] args) {
		/*
		 * 7 days a week if day is 2 or 4---- we have SDLC Class if day is 6 or 7---- we
		 * have JAVA class if day is 1 or 5---- we have NO Class if day is 3 review
		 * Class
		 */
		int day = 3;
		if (day == 2 || day == 4) {
			System.out.println("we have SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("we have JAVA Class");
		} else if (day == 1 || day == 5) {
			System.out.println(" we have No Class");
		} else {
			System.out.println("We have Review Class");

		}
		System.out.println("=======================================================");
		/*
		 * 7 days a week if day is Tuesday or Thursday---- we have SDLC Class if day is
		 * Saturday or Sunday---- we have JAVA class if day is Monday or Friday---- we
		 * have NO Class if day is Wednesday -----review Class
		 */
		String weekDay = "Sunday";
		if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("we have JAVA class");
		} else if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("we have SDLC Class");
		} else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println(" we are Off");
		} else {
			System.out.println(" Day is out of range");
		}
		System.out.println("///////////////////////////////////////////////////////");

		String Day="Friday";
		if (Day.equals(" Sunday") || Day.equals("Saturday")){
			System.out.println("We have JAVA class");	
		}else if(Day.equals("Thursday") || Day.equals("Friday")){
		System.out.println(" We are Off");
	}else {
		System.out.println("We have SDLC Class");
	}
	}
}
