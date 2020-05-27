package savant.pad;

import java.util.Scanner;

public class Rocket 
{

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;
        // program code
        System.out.println("Type your age or 0 to quit");
        
        while (true) {
            age = Integer.parseInt(reader.nextLine());

            if ( (age >= 5 && age <= 85) || age==0) {  // age between 5 AND 85
                break;  // end the loop
            }

            System.out.println("You are lying!");
            if (age < 5) {
                System.out.println("You are so young that you cannot know how to write!");
            } else {  // that means age is over 85
                System.out.println("You are so old that you cannot know how to use a computer!");
            }

            System.out.println("Type your age again: ");
        }

        System.out.println("Your age is " + age);
    }

}
