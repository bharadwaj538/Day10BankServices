package ai.jobiak.services;

public class Account implements AccountService {

	private String accNo;
	private String fullName;
	private double balance;
	public Account(String accNo, String fullName, double balance) {
		super();
		this.accNo = accNo;
		this.fullName = fullName;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public double withdraw(double amount) {
		
		return 0;
	}
	@Override
	public double deposit(double amount) {
		this.balance +=amount;
		return 0;
	}
	@Override
	public boolean transfer(Account account, double amount) {
		this.balance -=amount;
		account.setBalance(account.getBalance()+amount);
		return false;
	}
	@Override
	public double getBalance(String accNo) {
		return 0;
	}
	
	
}
