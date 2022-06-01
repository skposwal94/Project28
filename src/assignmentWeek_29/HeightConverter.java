package assignmentWeek_29;

import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
		
//		taking input from user in feet and inches and giving final height in centimeters

		
		int UserHeightFeet = 0;              // Initializing variables 
		int UserHeightInches = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Hi user please enter your height in feet");    // taking input of height in feet using while loop to make sure 
		UserHeightFeet = scn.nextInt();									   // positive value is entered 
		while (UserHeightFeet<0) {
			System.out.println("Please enter a positive value");
			UserHeightFeet = scn.nextInt();
		}
		
		System.out.println("Please enter your height in inches");
		UserHeightInches = scn.nextInt();								// getting i/p for inches and ensuring value entered is between 0 and 12
		while (UserHeightInches>=12 || UserHeightInches<0) {			// using while loop
			System.out.println("Please enter inches between 0 and 12");
			UserHeightInches = scn.nextInt();
		}
		
		System.out.println("You have entered your height as " + UserHeightFeet +" feet and "
				+ UserHeightInches + " inches tall");
		
		double HeightInCm = 30.48*UserHeightFeet + 2.54*UserHeightInches;		// calculating height in centimeters and printing value
		System.out.println("Your height in centimeters is " + HeightInCm);
		
		scn.close();
	}

}
