package Day_07;

public class WhileLoop {
public static void main(String[] args) {
	/*TASK
	 * Create a boolean variable workDay and assign true,
	 * create int variable day and assign it to 1 
	 * ● As long as it is workDay print “I need a day off” and increase day. 
	 * ● Once day is 6 or 7 print “I do not need a day off any more”
	 * 
	 */
	
	boolean workDay= true;
	int isDay=1;
	while(workDay==true) {
		if(isDay==6 || isDay==7) {
			workDay=false;
			System.out.println(" I do not need a day off any more");	
		}else {
			System.out.println(" i need a day off");
		}
		isDay++;
	}
	
	
}
}
