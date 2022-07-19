package thisProjectIsMajor;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {

		
		String FilePathInYourComputer = "C:\\Users\\skpos\\Downloads\\phase-1.txt";

		Simulation s1 = new Simulation();
		
		s1.loadItems(FilePathInYourComputer);
		
		ArrayList<Rocket> listOfR1 = s1.loadU1(s1.loadItems(FilePathInYourComputer));   // R1 array list without probability 
		
		
		ArrayList<Rocket> listOfR2 = s1.loadU2(s1.loadItems(FilePathInYourComputer));   // R2 array list without probability 
		
		System.out.println();
		
		s1.runSimulation(listOfR1);  // R1 with probability 
		
		s1.runSimulation(listOfR2); // R2 with probability 


		System.out.println("Total cost of R1 fleet, phase 1: $" + s1.runSimulation(listOfR1) +" million");
		System.out.println();
		System.out.println("Total cost of R2 fleet, phase 1: $" + s1.runSimulation(listOfR2) +" million");

		
		
	}

}
