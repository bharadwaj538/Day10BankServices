package ai.jobiak.services;

public interface AccountService {
	public double withdraw(double amount);
	public double deposit(double amount);
	public boolean transfer(Account account,double amount);
	public double getBalance(String accNo);
}
