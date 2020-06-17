package watch.my.beans;

import java.util.ArrayList;

public class Feast 
{

    private ArrayList<String> meals;
    
    public Feast() 
    {
        this.meals = new ArrayList<String>();
    }

    public String addMeal(String meal)
    {
	    	boolean exists = false;
	    	
	    	for (String var1 : this.meals) 
	    		{
	            if ( var1 ==  meal)
	            	{
	            	exists = true;
	            	break;
	            	}
	            	
	        }
	    		if (exists) {return "Already available";}
	    					else
	    					{ this.meals.add(meal);
	    					return "Bigger feast";
	    					}
    	}
    
    public void whatToFeastOn()
    {
     	for (String var1 : this.meals) 
		{
     		System.out.println(var1);
        	}
    	
    }
    
    public void feastOut()
    {
    			this.meals.clear();
    }
    

}
