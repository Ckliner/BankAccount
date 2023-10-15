
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create BankAccount
		BankAccount bankAccount = new BankAccount();
		bankAccount.setFirstName("Chris");
		bankAccount.setLastName("Kline");
		bankAccount.setAccountID(256153);
		
		//Deposit & Withdrawl
		bankAccount.deposit(1500.00);
		bankAccount.withdrawal(750.00);
		
		//Display Account Info
		System.out.println("Bank Account Information: ");
		bankAccount.accountSummary();
		
		
		//Create Checking Account
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.setFirstName("Chris");
		checkingAccount.setLastName("Kline");
		checkingAccount.setAccountID(65145465);
		checkingAccount.setInterestRate(2.0);
		
		//Deposit & Withdrawal
		checkingAccount.deposit(2000.0);
		checkingAccount.withdrawal(2500.00);
		
		//Display Account Info
		System.out.println("Checking Account Information:");
		checkingAccount.displayAccount();

	}

}
