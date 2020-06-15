package watch.my.beans.scale

class Account (accountHolderNameIn: String, accoutNumberIn: String) 
{
    
    var accountHolderName        = accountHolderNameIn
    var accoutNumber             = accoutNumberIn
    var accountBalance: Double   = 0
    
    def updateBalance(amount: Double) {
      accountBalance = accountBalance + amount 
   }



}