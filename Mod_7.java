// Andrew Schaefer
// 6/20/21
// Mod 7 Assignment

// This simple program prompts the user to enter a password
// and checks its validity based on the requirements set in
// a method called checkPassword.


// Imports the java.util package
import java.util.*;

public class Mod_7 {
	public static void main(String[] args) {
		
		// Displays message that informs the user of the password requirements
		System.out.println("This is a password validation program. The Password " +
		"requirements are as follows: ");
		System.out.print("\nPassword must be at least eight characters long." + 
		"\nPassword must contain both letters and digits." +
		"\nPassword must contain at least one upper case and one lower case letter");
		
		// Creates a scanner object 
		Scanner input = new Scanner(System.in);
		
		// Prompts the user for a string and assigns it to the variable called password
		System.out.println("\nEnter a password: ");
		String password = input.nextLine();
		
		// checkPassword method call
		checkPassword(password);

	}
	
	// checkPassword method definition
    public static void checkPassword(String password) {
	
	// Method body IF statements check password to determine if it meets the 
	// requirements and displays a message depending on the result.
	if (password.length() >= 8 && password.matches(".*\\d+.*") 
		&& password.matches(".*[A-Z]+.*") && password.matches(".*[a-z]+.*"))
		System.out.println("\nYou have entered a valid password.");
	else 
		System.out.println("\nYour password does not match one or more of the " +
		"requirements.");
	}
	
}