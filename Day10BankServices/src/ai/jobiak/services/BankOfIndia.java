package ai.jobiak.services;

public class BankOfIndia {

	public static void main(String[] args) {
		
		Account account1= new Account("Acc1","rama",10000);
		Account account2= new Account("Acc2","krish",15000);
		Account account3= new Account("Acc3","raki",20000);
		
		AccountService service=account1;
		double result=service.deposit(1000);
		System.out.println(result);
		System.out.println(account1.getBalance());
		
		service = account2;
		boolean result3=service.transfer(account3, 2000);
		System.out.println(result3);
		System.out.println(account2.getBalance());
		
		service =account3;
		double result1=service.withdraw(1000);
		System.out.println(result1);
		System.out.println(account3.getBalance());
	}

}
