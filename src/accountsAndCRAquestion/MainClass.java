package accountsAndCRAquestion;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(89795);
//		boolean isCRA;

		System.out.println("Sin num :" + employee.getSinNumber());

		employee.setSinNumber(23456, true, 6666);

		System.out.println("Sin num :" + employee.getSinNumber());

		employee.setSinNumber(342432, false, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

		// only CRA can change the SIN Number

		employee.setSinNumber(23456, true, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());
		
		
		////
		
		System.out.println();
		
		CRA craObject = new CRA("Supervisor", 101);   // creating CRA object
		
		employee.setSinNumberCRA(1111, true, 1234, craObject);  // passing CRA object create above in setter method below
		System.out.println("Sin num :" + employee.getSinNumber());

		

	}

}
