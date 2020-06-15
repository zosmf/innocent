package watch.my.beans;

public class Account 
{

	private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    
    public Account( String accountHolderName, String accoutNumber)
    {
    	this.accountNumber 		= accoutNumber;
    	this.accountHolderName	= accountHolderName;
    	this.accountBalance		= 0;
    	
    	
    	
    }

    public static void transfer(Account from, Account to, double amount)
	{
			from.accountBalance 		= from.accountBalance - amount;
			to.accountBalance 		= to.accountBalance + amount;
		
	}
    
    public void updateBalance(double amount)
	{
			this.accountBalance = this.accountBalance + amount;
		
	}
    
    public double getBalance()
	{
			return this.accountBalance;
		
	}
    
    public String getHolderNAme()
    {
    			return this.accountHolderName;
    }
    


}
