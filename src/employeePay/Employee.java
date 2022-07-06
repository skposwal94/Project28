package employeePay;

public class Employee implements Comparable<Employee>{

	private String firstName;
	private String LastName;
	private int sinNumber;
	private double salaryOrWage;

	public Employee(String firstName, String lastName, int sinNumber, double salaryOrWage) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.sinNumber = sinNumber;
		this.salaryOrWage = salaryOrWage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(int sinNumber) {
		this.sinNumber = sinNumber;
	}

	public double getSalaryOrWage() {
		return salaryOrWage;
	}

	public void setSalaryOrWage(double salaryOrWage) {
		if (salaryOrWage >= 0) {
			this.salaryOrWage = salaryOrWage;
		} else {
			System.out.println("Salary can't be negative");
		}
	}
	


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", LastName=" + LastName + ", sinNumber=" + sinNumber
				+ ", salaryOrWage=" + salaryOrWage + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (o.salaryOrWage - this.salaryOrWage);
	}
 

}
