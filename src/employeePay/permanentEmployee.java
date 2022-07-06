package employeePay;

public class permanentEmployee extends Employee {

	double biweeklySalary;

	public permanentEmployee(String firstName, String lastName, int sinNumber, double salaryOrWage,
			double biweeklySalary) {
		super(firstName, lastName, sinNumber, salaryOrWage);
		this.biweeklySalary = biweeklySalary;
	}

	public  double calculatePay(permanentEmployee permanentEmployee) {
		return permanentEmployee.biweeklySalary;
	}

}
