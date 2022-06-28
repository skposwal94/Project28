package packageATM2;

import java.util.Scanner;

public class MethodsClassATM {
	
	// In this class all methods are private and static except the last method get started 
	// which is calling other functions internally based off user input and after verifying 
	// correct PIN
	
	static Scanner sc = new Scanner(System.in);

	private MethodsClassATM() {               // declared private constructor as private
	}

	private static void displayInfo(PersonClassATM p) {             // defining methods as static and private 
		System.out.println("Your name is: " + p.getPersonName());
		System.out.println("Your Bank account no. is: " + p.getBankAccountNumber());
		System.out.println("Your account type is: " + p.getTypeOfAccounts());
		System.out.println("Your account balance is: " + p.getFundsAvailable());
		System.out.println("Your daily  limit is: " + p.getDailyCashLimit());

	}

	private static void withDrawCash(PersonClassATM p) {
		System.out.println("Hi user enter the amount you'd like to withdraw");
		double amountToWithdraw = sc.nextDouble();
		if (amountToWithdraw <= p.getFundsAvailable()) {
			p.setFundsAvailable(p.getFundsAvailable() - amountToWithdraw);
			System.out.println("Your final funds available are: " + p.getFundsAvailable());
		} else {
			System.out.println("Insufficent funds transcations failed");
		}

	}

	private static void DepositCash(PersonClassATM p) {
		System.out.println("Hi user enter the amount you'd like to deposit");
		double amountToDeposit = sc.nextDouble();
		p.setFundsAvailable(p.getFundsAvailable() + amountToDeposit);
		System.out.println("Your final funds available are: " + p.getFundsAvailable());

	}

	private static void DailyCashLimit(PersonClassATM p) {
		System.out.println("Your current daily cash limit is " + p.getDailyCashLimit());
		System.out.println("Enter new daily cash limit");
		double newDailyCashLimit = sc.nextDouble();
		p.setDailyCashLimit(newDailyCashLimit);
		System.out.println("Your new Daily cash limit is: " + p.getDailyCashLimit());

	}

	static void getStarted(PersonClassATM p) {
		System.out.println("Enter PIN to continue");
		int PIN = sc.nextInt();

		if (PIN == p.getPin()) {
			System.out.println("Enter 1 to display account info");
			System.out.println("Enter 2 to withdraw cash");
			System.out.println("Enter 3 to deposit cash");
			System.out.println("Enter 4 to change daily transcation limit");
			int operationToPerform = sc.nextInt();

			switch (operationToPerform) {
			case 1: {
				MethodsClassATM.displayInfo(p);           // methods called internally 
				break;

			}
			case 2: {
				MethodsClassATM.withDrawCash(p);
				break;

			}
			case 3: {
				MethodsClassATM.DepositCash(p);
				break;

			}
			case 4: {
				MethodsClassATM.DailyCashLimit(p);
				break;

			}
			default:
				System.out.println("Incorrect key please enter keys 1-4");
			}

		} else {
			System.out.println("Incorrect PIN");
		}
	}
}
