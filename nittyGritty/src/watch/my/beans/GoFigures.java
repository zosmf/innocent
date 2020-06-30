package watch.my.beans;

import java.util.ArrayList;

public class GoFigures 
{
	ArrayList<Integer> listOfThem;
	
	public GoFigures()
	{
		this.listOfThem = new ArrayList<Integer>();
	}

	public void placeFigure(int figure)
	{
		this.listOfThem.add(figure);
	}
	
	public int getCountOfFigures()
	{
		return this.listOfThem.size();
	}
	
	public int sumThemFigures()
	{
		int output = 0;
		
	 	for (int var1 : this.listOfThem) 
		{
	 		output = output + var1;
        	}
		
		return output;
	}

	public double smoothThemFigures()
	{
		double output = 0;
		
		for (int var1 : this.listOfThem) 
		{
	 		output = output + var1;
        	}
		
		return output / this.listOfThem.size();
	}


}

