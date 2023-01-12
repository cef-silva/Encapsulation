package entities;

public class BankAcount {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAcount(int accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public BankAcount(int accountNumber, String name, double initialDeposit){
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.00;
	}
	
	public String toString() {
		return "Acount "
				+ getAccountNumber()
				+ ", Holder: "
				+ getName()
				+", Balance: "
				+ getBalance();
	}
	
}
