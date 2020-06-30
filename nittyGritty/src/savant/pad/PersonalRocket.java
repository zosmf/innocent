package savant.pad;

import watch.my.beans.*;

public class PersonalRocket 
{

	public static void main(String[] args) 
	{
		GoFigures stats = new GoFigures();
        stats.placeFigure(3);
        stats.placeFigure(5);
        stats.placeFigure(1);
        stats.placeFigure(2);
        System.out.println("Count: " + stats.getCountOfFigures());
        System.out.println("Sum: " + stats.sumThemFigures());
        System.out.println("Average: " + stats.smoothThemFigures());
	}

	
	
	

	
}
