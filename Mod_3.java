
 
// Andrew Schaefer
// 6/4/21
// Mod 3 Assignment

// This simple program recreates the common Rock, 
// Paper, Scissors game.
 
// Imports Scanner from the java.util package
import java.util.*;

// Imports concurrent ThreadLocalRandom from the java.util. package
import java.util.concurrent.ThreadLocalRandom;

public class Mod_3 {
	public static void main(String[] args) {
		
		// Displays the rules
		System.out.println("This simple program is a" +
          " recreation of the common Rock, Paper, Scissors" +
          " game. 1 is for rock, 2 is for paper, and 3 is" + 
          " for scissors.");
		  
		 // Creates a scanner object 
		Scanner input = new Scanner(System.in);
		
		// Prompts user for their number choice and assigns 
		// it to the variable user_choice
		System.out.print("Enter your choice: ");
		int user_choice = input.nextInt();
		
		// Generates a random number between 1 and 3 and assigns it to the
		// variable random_num
		int random_num = ThreadLocalRandom.current().nextInt(1,3 + 1);
		
		// Nested IF statements compare the two numbers to determine and 
		// display the results of the game.
		if (random_num == 1 && user_choice == 1) 
				System.out.println("You both chose rock, it is a draw!");
		else if (random_num == 1 && user_choice == 2)
			    System.out.println("Paper covers rock, user wins!");
		else if (random_num == 1 && user_choice == 3)
			    System.out.println("Rock destroys scissors, computer wins!");
		else if (random_num == 2 && user_choice == 2)
			    System.out.println("You both chose paper, it is a draw!");
		else if (random_num == 2 && user_choice == 1)
			    System.out.println("Paper covers rock, computer wins!");
		else if (random_num == 2 && user_choice == 3)
			    System.out.println("Scissors cuts paper, user wins!");
		else if (random_num == 3 && user_choice == 3)
			    System.out.println("You both chose scissors, it is a draw!");
		else if (random_num == 3 && user_choice == 1)
			    System.out.println("Rock destroys scissors, user wins!");
		else if (random_num == 3 && user_choice == 2)
			    System.out.println("Scissors cuts paper, computer wins!");
				
		
	}
}