package savant.pad

import watch.my.beans.scale._

object fling {
  def main(args: Array[String]) 
  {
     val wedding = new Feast
     
     wedding.addMeal("Hamburger")
     wedding.addMeal("Fish'n'Chips'")
     wedding.addMeal("Sauerkraut")
     
     wedding.whatToFeastOn()
     
     wedding.addMeal("Hamburger")
  
  
  }

}