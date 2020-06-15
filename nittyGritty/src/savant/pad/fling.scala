package savant.pad

import watch.my.beans.scale._

object fling {
  def main(args: Array[String]) 
  {
      val A = new Account("Mister A","0000000A")
      
      A.updateBalance(100)
      
      println(A.accountHolderName)
      println(A.accountBalance)
      
  
  
  }

}