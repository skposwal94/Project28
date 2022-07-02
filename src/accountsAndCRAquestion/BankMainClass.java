package accountsAndCRAquestion;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount chqAccount = new ChequingAccount();

		
//		chqAccount.depositMoney(1000);
//		chqAccount.depositMoney(200);
//		System.out.println(chqAccount.balance);

		SavingAccount svngAccount = new SavingAccount();

		TFSA tfsa = new TFSA();
//		tfsa.depositMoney(5000);

//		System.out.println("Balance in chequing : "+chqAccount.balance);
//		
//		System.out.println("Balance in Saving : "+svngAccount.balance);
//		
//		System.out.println("Balance in TFSA : "+tfsa.balance);

		chqAccount.authorizationAndBalance(1234, "Chequing", 200);
		System.out.println(chqAccount.balance);
		System.out.println();
		
		svngAccount.authorizationAndBalance(3456, "Saving", 300);
		System.out.println(svngAccount.balance);
		System.out.println();
		
		tfsa.authorizationAndBalance(6666, "TFSA", 400);
		System.out.println(tfsa.balance);
		System.out.println();

		

	}

}
