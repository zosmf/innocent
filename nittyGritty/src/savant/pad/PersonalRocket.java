package savant.pad;

import watch.my.beans.*;

public class PersonalRocket 
{

	public static void main(String[] args) 
	{

		Feast wedding = new Feast();
		
		System.out.println( wedding.addMeal("Hamburger") );
		wedding.addMeal("Fish'n'Chips'");
		wedding.addMeal("Sauerkraut");
		
		wedding.whatToFeastOn();
		
		System.out.println(wedding.addMeal("Hamburger"));
		
		wedding.whatToFeastOn();
		
		wedding.feastOut();
		
		wedding.whatToFeastOn();
     }

	
	
	

	
}
