package employeePay;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {

		permanentEmployee pe1 = new permanentEmployee("Sal1", "Poswal1", 1234, 0, 6000);
		pe1.setSalaryOrWage(pe1.calculatePay(pe1));

		permanentEmployee pe2 = new permanentEmployee("Sal2", "Poswal2", 1234, 0, 1500);
		pe2.setSalaryOrWage(pe2.calculatePay(pe2));

		permanentEmployee pe3 = new permanentEmployee("Sal3", "Poswal3", 1234, 0, 1700);
		pe3.setSalaryOrWage(pe3.calculatePay(pe3));

		ContractualEmployee ce1 = new ContractualEmployee("Sal4", "Poswal4", 1235, 0, 42, 20);
		ce1.setSalaryOrWage(ce1.calculatePay(ce1));

		ContractualEmployee ce2 = new ContractualEmployee("Sal5", "Poswal5", 1235, 0, 32, 23);
		ce2.setSalaryOrWage(ce2.calculatePay(ce2));

		ContractualEmployee ce3 = new ContractualEmployee("Sal6", "Poswal6", 1235, 0, 40, 30);
		ce3.setSalaryOrWage(ce3.calculatePay(ce3));

		CommissionBasedEmployee cb1 = new CommissionBasedEmployee("Sal7", "Poswal7", 1236, 0, 4000, 1000);
		cb1.setSalaryOrWage(cb1.calculatePay(cb1));

		CommissionBasedEmployee cb2 = new CommissionBasedEmployee("Sal8", "Poswal8", 1236, 0, 3000, 10000);
		cb2.setSalaryOrWage(cb2.calculatePay(cb2));

		CommissionBasedEmployee cb3 = new CommissionBasedEmployee("Sal9", "Poswal9", 1236, 0, 8000, 500);
		cb3.setSalaryOrWage(cb3.calculatePay(cb3));

		CommissionBasedEmployee cb4 = new CommissionBasedEmployee("Sal10", "Poswal10", 1236, 0, 8000, 3000);
		cb4.setSalaryOrWage(cb4.calculatePay(cb4));

		Employee[] employees = { pe1, pe2, pe3, ce1, ce2, ce3, cb1, cb2, cb3, cb4 };
		System.out.println("Array before sorting" + Arrays.toString(employees));

//		Arrays.sort(employees);
//		System.out.println("Array after sorting" + Arrays.toString(employees));

		Employee highestPaid = employees[0];
		Employee lowestpaid = employees[0];

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalaryOrWage() >= highestPaid.getSalaryOrWage()) {
				highestPaid = employees[i];
			}
			if (employees[i].getSalaryOrWage() <= lowestpaid.getSalaryOrWage()) {
				lowestpaid = employees[i];
			}

			System.out
					.println(employees[i].getFirstName() + " has biweekly salary of " + employees[i].getSalaryOrWage());
		}

		System.out
				.println("\nHighest biweekly Salary: " + highestPaid.getFirstName() + " " + highestPaid.getLastName());
		System.out.println("Salary is: " + highestPaid.getSalaryOrWage());

		System.out.println("\nLowest biweekly Salary: " + lowestpaid.getFirstName() + " " + lowestpaid.getLastName());
		System.out.println("Salary is: " + lowestpaid.getSalaryOrWage());

		System.out.println("-----------");

//		System.out.println();
//		System.out.println("Highest Salary: "+ employees[0].getFirstName()+ " "+employees[0].getLastName());
//		System.out.println("Salary is: " + employees[0].getSalaryOrWage());
//
//		System.out.println();
//		System.out.println("Lowest Salary: "+ employees[9].getFirstName()+ " "+employees[9].getLastName());
//		System.out.println("Salary is: " + employees[9].getSalaryOrWage());

	}

}
