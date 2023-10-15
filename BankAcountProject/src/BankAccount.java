
public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	//Constuctor
	public BankAccount() {
		this.balance = 0.0;
	}
	
	//Deposit
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	//Withdrawal
	public void withdrawal(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
		}
	}
	
	//Setters & Getters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getAccountID() {
		return accountID;
	}
	
	//Return Balance
	public double getBalance() {
		return balance;
	}
	
	//Print Infoormation
	public void accountSummary() {
		System.out.println("Account Name: " + firstName + " " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: " + balance);
	}
}
