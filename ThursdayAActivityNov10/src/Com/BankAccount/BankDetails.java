package Com.BankAccount;

public class BankDetails {
	private Bank[] account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[4];
				
	}
public void checkBalance(Bank input)
{
	if(entry<account.length) 
	{
		account[entry]=input; 
		entry++; 
		
		if(input.getBalance()<(1000))
		System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance()); 
	}
}
	public static void main(String[] args) {
		
		Bank b1 = new Bank("sayuj",987654,6687.56);
		Bank b2 = new Bank("nandhu",956784,688.75);
		Bank b3 = new Bank("vavutty",912345,123453.74);
		Bank b4 = new Bank("smrithi",954321,89765);
		
		BankDetails myBank = new BankDetails();
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
	}

}
