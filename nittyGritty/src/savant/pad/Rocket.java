package savant.pad;

import java.util.ArrayList;
import java.util.Scanner;

public class Rocket 
{

	public static void main(String[] args) 
	{
        Scanner reader = new Scanner(System.in);
        int single;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        // program code
        System.out.println("We will average your inntegers ... for free and with 0 we will give too you:");
        
        while (true) 
		        {
        				
        				
        				single = Integer.parseInt(reader.nextLine());
		
		            if ( single==0 ) {  // single between 0 AND 0
		                break;  // end the loop
		            }
		
		            System.out.println("Bring some and more: ");
		            
		            intList.add(single);
		            
		        }

        			System.out.println("You have inputted --> " + intList.size()  + " integers");

        
     }

	
	
	
	public static void MethodicalGreeting(String lineFromTheBook) 
	{
        System.out.println("Discourse on the Method at line number --> " + lineFromTheBook);
    }

	
	public static double average(ArrayList<Integer> array) 
	{

		int sumofItAll = 0;
		
		for (int counter = 0; counter < array.size(); counter++) 
			{
					sumofItAll = array.get(counter) + sumofItAll; 		
			}   		

	    return sumofItAll;
	}
	
	public static void print(ArrayList<Integer> numbers) 
		{
	    		for (int number : numbers) 
	    		{
	    			System.out.println( number );
	    		}

	 }
	
}
