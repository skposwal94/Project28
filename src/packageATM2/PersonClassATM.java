package packageATM2;

public class PersonClassATM {
	
	// created all variable as private in persons class, using get and set method to pass
	// values to method class
	// created empty private variables and assigning values by calling an method in main class
	// implementing as for different persons based of different accounts or ATM cards 

	private String personName;
	private int bankAccountNumber;
	private double fundsAvailable;              // private variables with default values 
	private String typeOfAccounts;
	private double dailyCashLimit;
	private int pin;

	public void setValuesP0() {                    // method to assign values to variables 
		this.personName = "Salinder";
		this.bankAccountNumber = 123456;
		this.fundsAvailable = 1000;
		this.typeOfAccounts = "Checking";
		this.dailyCashLimit = 500;
		this.pin = 1234;
	}
	
	public void setValuesP1() {
		this.personName = "Sal";
		this.bankAccountNumber = 789012;
		this.fundsAvailable = 2000;
		this.typeOfAccounts = "Saving";
		this.dailyCashLimit =700;
		this.pin = 123;
	}

	public String getPersonName() {             // get method to use value in method class
		return this.personName;
	}

//	public void setPersonName(String personName) {
//		this.personName = personName;
//	}

	public int getBankAccountNumber() {
		return this.bankAccountNumber;
	}

//	public void setBankAccountNumber(int bankAccountNumber) {
//		this.bankAccountNumber = bankAccountNumber;
//	}

	public double getFundsAvailable() {
		return this.fundsAvailable;
	}

	public void setFundsAvailable(double fundsAvailable) {    // set method to change value in method class
		this.fundsAvailable = fundsAvailable;
	}

	public String getTypeOfAccounts() {
		return this.typeOfAccounts;
	}

//	public void setTypeOfAccounts(String typeOfAccounts) {
//		this.typeOfAccounts = typeOfAccounts;
//	}

	public double getDailyCashLimit() {
		return this.dailyCashLimit;
	}

	public void setDailyCashLimit(double dailyCashLimit) {
		this.dailyCashLimit = dailyCashLimit;
	}

	public int getPin() {
		return this.pin;
	}
//
//	public void setPin(int pin) {
//		this.pin = pin;
//	}

}
