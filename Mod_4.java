

// Andrew Schaefer
// 6/6/21
// Module 4 Assignment

// This simple program prompts the user for two strings
// and then determines if one is a substring of the other.

// Imports Scanner from the java.util package
import java.util.Scanner;

public class Mod_4 {
	public static void main(String[] args) {
		
		// Creates a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompts user for first string and assigns it to variable s1
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		// Prompts user for first string and assigns it to variable s2
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		// Determines if either s2 is a substring of s1, and if it is, 
		// displays a message 
		if (s1.contains(s2))
			System.out.println(s2 + " is a substring of " + s1 + ".");
		
		// Determines if either s2 is a substring of s1, and if it is, 
		// displays a message
		if (s2.contains(s1))
			System.out.println(s1 + " is a substring of " + s2 + ".");
		
		// If no string is a substring of the other, displays a message
		else
			System.out.println("No substrings here.");

	}
}