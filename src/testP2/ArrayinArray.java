package testP2;

import java.util.Arrays;

public class ArrayinArray {

	public static void main(String[] args) {
		
		// Firstly used array of same size to get all values where 5 is
		// secondly used declared array from counter variable of exact size required
		// finally transfered values to final array
		// **** Only confusion can be when 5 is at index 0 resolved that in line 35 by explaining 
		// line 35 maybe not required just for explanation 

		
		String[] daysInAWeek =  {"5","3","3","4","7","6","9","7","2"}; //Initialization block
		System.out.println("Days in a week " + Arrays.toString(daysInAWeek));
		int counter = 0;
		
		int[] arrayIndex = new int[daysInAWeek.length];
		
		
		for (int i = 0; i < daysInAWeek.length; i++) {

			if (daysInAWeek[i].equals("5")) {
				counter++;
				arrayIndex[counter-1] = i;
								
			}
		}
		
		System.out.println("Printing arrayIndex for understanding only" + Arrays.toString(arrayIndex));

		System.out.println("\ntotal values are " + counter);
		
		if(counter==0) {
			System.out.println("\nValue of 5 does not exist so no array for displaying indexes");
		}
		
		int[] arrayFinal = new int[counter];
		
		for(int i = 0; i<=(counter-1);i++) {
			
			arrayFinal[i] = arrayIndex[i];
		}
		
		
		System.out.println("\nIndex where stored " + Arrays.toString(arrayFinal));

	}

}
