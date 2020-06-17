package watch.my.beans.scale

import scala.collection.mutable.ArrayBuffer

class Feast 
{
 
        var meals = ArrayBuffer[String]();
        
        def addMeal (meal: String)
        {
             if( !meals.contains(meal) ) meals.+=(meal) else println("Served arleady")
        }
        
        def whatToFeastOn()
        {
          println(meals)
        }

}