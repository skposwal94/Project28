package forLoopWeek29M;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		
		//checking if a no. is prime using no. of factors 

		System.out.println("Hi user please enter the number:");
		Scanner scn = new Scanner(System.in);
		int numberEntered = scn.nextInt();
		int counter =0;

		System.out.println("\nNumber entered " + numberEntered);
		
		for(int i=1;i<=numberEntered;i++) {
			
			if(numberEntered%i==0) {
				counter++;
			}
		}
		
		if(counter == 2) {
			System.out.println("Entered number is Prime");       // Prime no. only has two factors 1 and no. itself
		}else {
			System.out.println("Entered number is Non-Prime");   // Non prime will have more than two factors, 1 will have 1
		}
		
		scn.close();

	}

}
