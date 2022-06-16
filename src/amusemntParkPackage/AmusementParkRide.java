package amusemntParkPackage;

public class AmusementParkRide {

	void eligibilitycheck(int h, int w) {

		if ((90 <= h) & (200 >= h) & (15 <= w) & (95 >= w)) {

			System.out.println("Enjoy your Ride");

		} else {

			System.out.println("Sorry you can't ride");
		}

	}

}
