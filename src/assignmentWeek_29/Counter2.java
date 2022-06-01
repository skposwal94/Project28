package assignmentWeek_29;

import java.util.Scanner;

public class Counter2 {

	public static void main(String[] args) {
		
		// counting total number entered by user and allowing user to exit

		int counter = 0;
		String toStop = "";
		double enterNumber = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("start entering numbers:\n");
		
		do {
			
			enterNumber = scn.nextDouble();
			counter++;
			System.out.println("\nNo. you have entered is: " + enterNumber);
			System.out.println("Type 'exit' to stop or any 'cont.' to continue");
			toStop = scn.next();
			if(toStop.equals("exit")) {
				break;
			}
//			else {
//				continue;
//			}
			
		}while(!toStop.equals("exit"));
		
		System.out.println("\nTotal entries: "+ counter);
		
		scn.close();
		
	}

}
