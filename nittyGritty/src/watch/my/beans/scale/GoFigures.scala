package watch.my.beans.scale

import scala.collection.mutable.ArrayBuffer

class GoFigures 
{
    
    var listOfThem = ArrayBuffer[Int]();
    
    def getCountOfFigures() : Int =
    {
      return listOfThem.size
    }
    
    def placeFigure(input: Int)
    {
      listOfThem.+=(input)
    }
    
    def sumThemFigures() : Int =
    {
      listOfThem.sum
    }

    def smoothThemFigures() : Double =
    {
      listOfThem.sum.toDouble / listOfThem.size.toDouble
    }
    
}