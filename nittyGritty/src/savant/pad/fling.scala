package savant.pad

import watch.my.beans.scale._

object fling {
  def main(args: Array[String]) 
  {
     
      val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
      val wedding = new pickYourWeather
    
      for (day <- weekDays) println( day + ": " + wedding.whatKindOfWeather())
   
    
  }

}