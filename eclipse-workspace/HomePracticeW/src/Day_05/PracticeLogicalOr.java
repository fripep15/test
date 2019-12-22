package Day_05;

public class PracticeLogicalOr {

	public static void main(String[] args) {
		/*
		 * 7 days a week if day is 2 or 4---- we have SDLC Class if day is 6 or 7---- we
		 * have JAVA class if day is 1 or 5---- we have NO Class if day is 3 review
		 * Class
		 */
int day=4;

if (day==2||day==4){
	System.out.println(" We have SDLC Class");
}else if(day==1 || day==5) {
	System.out.println(" We have no calss");
}else if (day==3) {
	System.out.println(" we have review class");
	
} else if(day==6 || day==7) {
	System.out.println(" We are Off");
}else {
	System.out.println(" Day not recognized");
}
	}

}
