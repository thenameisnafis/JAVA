import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(11111111);
		a1.setAccountHolderName("OOP1 G");
		a1.setBalance(4000.0);
		
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account(22222222, "OOP1 C", 3500.0);
		a2.showDetails();
		a1.sendmoney(a2, 500.0);
		System.out.println("Balance: "+a1.getBalance());
		System.out.println("Balance: "+a2.getBalance());
		
		
	}
}