package switchStatementArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class WaysToInitializeArrays {
	
	// showing ways to create or initialize arrays

	public static void main(String[] args) {

		// Option 1 to create arrays
		
		String[] studentsInClass = {"S1", "S2" , "S3", "S4", "S5"};
		System.out.println(studentsInClass);
		System.out.println(Arrays.toString(studentsInClass));
		System.out.println();
		
		// Option 2
		
		String[] studentInClass2 = new String[5];
		studentInClass2[0] = "s1";
		studentInClass2[1] = "s2";
		studentInClass2[2] = "s3";
		studentInClass2[3] = "s4";
		studentInClass2[4] = "s5";
		
		// also can use for loop and scanner class as shown below
		
		String[] studentInClass3 = new String[5];
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < studentInClass3.length; i++){
			System.out.println("Enter value at index " + i);
			studentInClass3[i] = scn.nextLine();
			
			
		}
		System.out.println(Arrays.toString(studentInClass3));
		
		scn.close();
		
	}

}
