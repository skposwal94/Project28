package switchStatementArrayAssignment;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		/*
		 * Taking i/p from user than getting operation based on idea of actual
		 * calculator then asking to put in second number and printing final results
		 */

		double firstNumber = 0;
		double secondNumber = 0;   // Initializing variables
		String operation = "";

		Scanner scn = new Scanner(System.in);

		System.out.println("Hi user enter your first number");
		firstNumber = scn.nextDouble();

		System.out.println("Enter which operation would you like to perform");
		System.out.println(" Add. for addition");
		System.out.println(" Sub. for subtraction");
		System.out.println(" Mul. for multiplication");
		System.out.println(" Div. for division\n");

		operation = scn.next();                // taking input from user for operation

		switch (operation) {
		case "Add.": {
			System.out.println("Enter second number: ");
			secondNumber = scn.nextDouble();
			System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
			break;

		}
		case "Sub.": {
			System.out.println("Enter second number: ");
			secondNumber = scn.nextDouble();
			System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
			break;

		}
		case "Mul.": {
			System.out.println("Enter second number: ");
			secondNumber = scn.nextDouble();
			System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
			break;

		}
		case "Div.": {
			System.out.println("Enter second number: ");
			secondNumber = scn.nextDouble();
			System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
			break;

		}
		default:
			System.out.println("Entered operation is not supported");      // covering invalid case
			break;
		}

		scn.close();

	}

}
