package employeePay;

public class ContractualEmployee extends Employee {

	double hourlyWage;
	double hoursWorkedInWeek;

	public ContractualEmployee(String firstName, String lastName, int sinNumber, double salaryOrWage,
			double hoursWorkedInWeek, double hourlyWage) {
		super(firstName, lastName, sinNumber, salaryOrWage);
		this.hoursWorkedInWeek = hoursWorkedInWeek;
		this.hourlyWage = hourlyWage;
	}

	public double calculatePay(ContractualEmployee ContractualEmployee) {
		if (ContractualEmployee.hoursWorkedInWeek <= 40) {
			return hoursWorkedInWeek * hourlyWage * 2;
		} else {

			return (hourlyWage * 80 + (hoursWorkedInWeek - 40) * 1.5 * hourlyWage*2);
		}

	}

}

// 