package employeePay;

public class CommissionBasedEmployee extends Employee {

	double baseSalary;
	double salesDone;

	public CommissionBasedEmployee(String firstName, String lastName, int sinNumber, double salaryOrWage,
			double baseSalary, double salesDone) {
		super(firstName, lastName, sinNumber, salaryOrWage);

		this.baseSalary = baseSalary;
		this.salesDone = salesDone;
	}

	public double calculatePay(CommissionBasedEmployee CommissionBasedEmployee) {

		return (CommissionBasedEmployee.baseSalary + 0.15 * CommissionBasedEmployee.salesDone) / 2;
	}

}
