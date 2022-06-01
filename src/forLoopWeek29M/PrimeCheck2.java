package forLoopWeek29M;

import java.util.Scanner;

public class PrimeCheck2 {

	public static void main(String[] args) {
		
		//checking if a no. is prime using boolean

		System.out.println("Hi user please enter the number:");
		Scanner scn = new Scanner(System.in);
		int numberEntered = scn.nextInt();
		Boolean noIsPrime = true;

		System.out.println("\nNumber entered " + numberEntered);

		if (numberEntered == 1) {
			System.out.println("Number is not a Prime no.");
		}

		else {
			for (int i = 2; i <= numberEntered / 2; i++) {

				if (numberEntered % i == 0) {
					System.out.println("Number is not a Prime no.");
					noIsPrime = false;
					break;
				}
			}
			if (noIsPrime == true) {
				System.out.println("It is a prime no.");
			}
		}

		scn.close();
	}

}
