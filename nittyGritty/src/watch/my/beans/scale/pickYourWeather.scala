package watch.my.beans.scale

class pickYourWeather 
{
        val thePick = scala.util.Random
        
        
        def whatKindOfWeather() : String = 
        { 
          val val1 = thePick.nextDouble()
          
          if (val1 <= 0.1) 
            {
            return "Sleet"
            }
          else
            {  if(val1 <= 0.4)
                 return"Snow"
                else
                  return "Sunny"
                
             }
            
            
        }
        
        def pickYourHeat() : Int =
        {
            (4  * thePick.nextGaussian()  -3 ).toInt
        }

}