package assignmentWeek_29;

import java.util.Scanner;

public class NumberCounter {
	
	public static void main(String[] args) {
		
		// counting total number entered by user and allowing user to exit
	   // using string input with the idea that parse int can be used later to get no. 
		
		int counter = 0;               // Initializing counter
		String enterNumber = "";		// Initializing value to be entered 
//		String toStop = "";
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Hi user start entering number program will keep count\n"
				+ "type exit when want to stop\n");
		
		do {
		 	enterNumber = scn.next();			// taking i/p will stop when value entered is exit
			counter++;
			
		}while(!enterNumber.equals("exit"));
		
		System.out.println("\nYou have stopped entering nunbers\ntotal numbers entered are " + (counter-1)); 
	
		scn.close();
		
	}

}
