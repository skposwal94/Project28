package testP;

import java.util.Scanner;

public class SimpleClass {

	public static void main(String[] args) {

		double loanamount = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter initial amount:");
		loanamount = scn.nextDouble();

		for (int i = 1; i <= 3; i++) {
			System.out.println("Month " + i + " payment =" + 0.1 * loanamount);
			loanamount = (double) (loanamount - 0.1 * loanamount);
			System.out.println("Remaining balnce left " + (loanamount)+"\n");
		}

		System.out.println("\nFinal amount owed: " + (loanamount));

	}

}
