package savant.pad;

import watch.my.beans.*;

public class PersonalRocket 
{

	public static void main(String[] args) 
	{

		Account A = new Account("Mister A","0000000A");
		A.updateBalance(100);
		
		Account B = new Account("Miss B","0000000B");
		Account C = new Account("Miss C","0000000C");
		
		Account.transfer(A,B,50);
		Account.transfer(B,C,25);
		
		System.out.println(A.getHolderNAme() + " ---> " + A.getBalance());
		System.out.println(B.getHolderNAme() + " ---> " + B.getBalance());
		System.out.println(C.getHolderNAme() + " ---> " + C.getBalance());
        
     }

	
	
	

	
}
