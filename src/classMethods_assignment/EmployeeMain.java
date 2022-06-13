package classMethods_assignment;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
//		e1.firstName = "Salinder";
//		e1.lastName = "Poswal";
//		e1.hourlyPay = 20;
		
		e1.getinfo();
		e1.displayInfo();
		e1.weeklySalaryCalculator();
	}

}
