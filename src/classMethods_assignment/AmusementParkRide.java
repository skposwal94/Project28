package classMethods_assignment;

import java.util.Scanner;

public class AmusementParkRide {

	int height;
	double weight;
	Scanner scn = new Scanner(System.in);

	void checkEligibilityToRide() {

		System.out.println("Hi person please enter your height");
		height = scn.nextInt();

		System.out.println("Hi person please enter your weight");
		weight = scn.nextDouble();

		if ((90 <= height) & (200 >= height) & (15 <= weight) & (95 >= weight)) {

			System.out.println("Enjoy your Ride");

		} else {

			System.out.println("Sorry you can't ride");
		}

	}

}
