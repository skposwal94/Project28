package thisProjectIsMajor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	// method for reading text file and storing in an array list
	public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		ArrayList<Item> items = new ArrayList<Item>();

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] oneItem = line.split("=");
			items.add(new Item(oneItem[0], Integer.parseInt(oneItem[1])));

		}

//        for (Item i : items) {
//            System.out.println(i.name + ": " + i.weight);
//        }

		scan.close();
		return items;
	}

	// method for rocket 1 array list to confirm how many rockets required

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

		ArrayList<Rocket> R1arrayList = new ArrayList<Rocket>();
		Rocket rocket = new R1();

		for (Item i : items) {

			if (rocket.canCarry(i)) {

				rocket.carry(i);

			} else {

				R1arrayList.add(rocket);
				rocket = new R1(); // Initializing back to null rocket
				rocket.carry(i);

			}

		}

		R1arrayList.add(rocket);

		System.out.println("Total R1 rockets used: " + R1arrayList.size());

		return R1arrayList;

	}

	// method for rocket 2 array list to confirm how many rockets required

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

		ArrayList<Rocket> R2arrayList = new ArrayList<Rocket>();
		Rocket rocket = new R2();

		for (Item i : items) {

			if (rocket.canCarry(i)) {

				rocket.carry(i);

			} else {
				R2arrayList.add(rocket);
				rocket = new R2(); // Initializing back to null rocket
				rocket.carry(i);

			}

		}

		R2arrayList.add(rocket);

		System.out.println("Total R2 rockets used: " + R2arrayList.size());

		return R2arrayList;

	}

	// method with probability included

	public int runSimulation(ArrayList<Rocket> rockets) {

		int extraRockets = 0;
		int budget = 0;

		for (Rocket r : rockets) {

			while (!r.launch()) { // launch probability

				r.land();
				extraRockets++;
			}

			if (!r.land()) { // land probability

				while (!r.launch()) {

					r.land();
					extraRockets++; // if rockets fails to land will need to account for launch probability again
				}

				while (!r.land()) {
					r.land();
					extraRockets++;
				}

			} else {
				continue;
			}

		}

//		System.out.println("Total extra rocket used: " + extraRockets);
		budget = (rockets.size() + extraRockets) * rockets.get(0).costofRocket;

		return budget;

	}

}
