package assignmentWeek_29;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		/*
		 * Letting the user decide which type of converter they want to use 'C to F' or
		 * 'F to C' getting that value using string and using if else to use different
		 * calculators
		 */
		

		double tempInCelsius = 0;          // Initializing temperature in Celsius 
		double tempInFahrenheit = 0;		// Initializing temperature in Fahrenheit 
		String converterType = "";			// empty string to decide which type of converter to use
		
		Scanner scn = new Scanner(System.in);
		System.out.println("User enter 'celsius' if you want to convert to celsius from fahrenheit "
				+ "or \nenter 'fahrenheit' for vice versa ");
		converterType = scn.next();
		
		if(converterType.equals("celsius")) {                                                        // block for converting to celsius
			System.out.println("\nPlease enter temprature in Fahrenheit to convert it to celsius"); 
			tempInFahrenheit = scn.nextDouble();
			tempInCelsius = (tempInFahrenheit - 32)*5/9;
			System.out.println("The temp in celsius is: " + tempInCelsius + " degrees");
			
		}else if(converterType.equals("fahrenheit")) {												// //  block for converting to farhrenheit
			
			System.out.println("\nPlease enter temprature in Celsius to convert it to fahrenheit");
			tempInCelsius = scn.nextDouble();
			tempInFahrenheit = tempInCelsius*9/5 + 32;
			System.out.println("The temp in fahrenheit  is: " + tempInFahrenheit + " degrees");
		}
		scn.close();
		 
		
	}

}
