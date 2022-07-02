package accountsAndCRAquestion;

public class Employee {
	
private int sinNumber ;
	
	private double salary;
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int sinNumber) {
		this.sinNumber = sinNumber;
	}

	public int getSinNumber() {
		return sinNumber;
	}
	

	public void setSinNumber(int sinNumber, boolean isCRA, int pin) {
		
		if(isCRA && sinNumber != 0 && pin ==1234) {
			this.sinNumber = sinNumber;
		}else {
			System.out.println("You don't have authority to change Sin number ");
		}
		
	}
	
	//Change to public void setSinNumber(int sinNumber, CRA cra, int pin)
	
	// only CRA employee with designation supervisor or job code 101 can be allowed to change PIN
	// passing CRA object as argument

	public void setSinNumberCRA(int sinNumber, boolean isCRA, int pin, CRA cr) {
		
		if(isCRA && sinNumber != 0 && pin ==1234 && cr.degisnation == "Supervisor" && cr.jobCode == 101) {
			this.sinNumber = sinNumber;
		}else {
			System.out.println("You don't have authority to change Sin number ");
		}
		
	}


}
