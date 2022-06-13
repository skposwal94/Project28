package classMethods_assignment;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	double hourlyPay;
	double weeklySalary;
	int hoursWorked;
	Scanner scn = new Scanner(System.in);

	void getinfo() {

		System.out.println("Please enter your first name:");
		firstName = scn.nextLine();

		System.out.println("your last name:");
		lastName = scn.nextLine();

		System.out.println("and your hourly pay:");
		hourlyPay = scn.nextDouble();

	}

	void displayInfo() {
		System.out.println("\nYour first name is " + firstName + ", last name is " + lastName
				+ " and you earn $" + hourlyPay+ " hourly");

	}

	void weeklySalaryCalculator() {

		System.out.println("\nHi " + firstName + " " + lastName + " enter your hours worked");
		hoursWorked = scn.nextInt();
		weeklySalary = hoursWorked * hourlyPay;
		System.out.println("Your Weekly earning is: $" + weeklySalary);
	}

}
