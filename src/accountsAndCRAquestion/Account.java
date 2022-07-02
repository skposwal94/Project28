package accountsAndCRAquestion;

public class Account {

	String name;

	String address;

	int sinNumber;

	int phoneNumber;

	double balance;

	public void depositMoney(double amount) {

		balance = (balance + amount);
	}
	
	// calling money to deposit method internally and updating the balance
	// taking input as pin, account and balance and updating in one go

	public void authorizationAndBalance(int pin, String account, int addBalance) {

		switch (account) {

		case "Chequing":
			if (pin == 1234) {
				System.out.println("Balance updated in chequing account");
				depositMoney(addBalance);

			}
			break;

		case "Saving":
			if (pin == 3456) {
				System.out.println("Balance updated in savings account");
				depositMoney(addBalance);
			}
			break;

		case "TFSA":
			if (pin == 6666) {
				System.out.println("Balance updated in TFSA account");
				depositMoney(addBalance);
			}
			break;

		}

	}

}
