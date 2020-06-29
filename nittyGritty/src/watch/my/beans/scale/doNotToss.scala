package watch.my.beans.scale

object doNotToss
{
        val nTosses = 100      
  
        def main(args: Array[String])
        {
        
          for
          {
            n <- 1 until nTosses
          } println( n + " -> " + util.Random.nextBoolean() ) 
                  
        }
        
        

}