
public class CheckingAccount extends BankAccount{
	private double interestRate;
	
	//Interest rate constructor
	public CheckingAccount() {
		super();
		this.interestRate = 0.0;
	}
	
	//Process withdrawals
	public void withdrawal(double amount) {
		if(amount > 0 && amount <=getBalance()) {
			super.withdrawal(amount);
		} else if (amount > 0 && amount >getBalance()) {
			super.withdrawal(30.0);
			System.out.println("Insufficent Funds: $30 Overdraft Fee");
		}
	}
	
	//Display Account
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + interestRate + "%");
	}
	
	//Interest Rate Setter
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Interest Rate Getter
	public double getInterestRate() {
		return interestRate;
	}
}
