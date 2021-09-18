// Andrew Schaefer
// 6/22/21
// Mod 8 Assignment

// This simple program creates methods with zero, one, two, and three parameters
// in order to calculate the total cost of hypothetical auto services. The assignment
// instructions call for a main method that tests each method twice, so the program 
// includes a while loop that allows as many tests as desired. 

// Imports the java.util package
import java.util.*;

public class Mod_8 {
	
	public static void main(String[] args) {
		
		// Variables declared
		int service_charge = 400;
		int oil_change = 40;
		int tire_rotation = 20;
		int coupon = 25;

		
		// Displays message that describes the program.
		System.out.println("This program use custom methods to calculate the cost of the " + 
		"selected auto services. You may test these methods as many times as you like by entering " +
		"different number choices.");
		
		// Displays auto services menu
		System.out.print("\n1. Standard yearly service charge" + 
		"\n2. Standard service charge and oil change" +
		"\n3. Standard service charge, oil change, and tire rotation" +
		"\n4. Standard service charge, oil change, tire rotation, and preferred customer coupon" +
		"\n5. Quit Program");
		
		// Creates a scanner object 
		Scanner input = new Scanner(System.in);

    // While loop allows multiple method tests, loops ends when user decides
	while (true) {
		
		// Prompts the user to input their choice of service
		System.out.println("\nEnter your number choice: ");
		int choice = input.nextInt();
		
		// If statements determine which method to call based on user input
        if (choice == 1)
			System.out.println("Your cost is $" + yearlyService());
		else if (choice == 2)
			System.out.println("Your cost is $" + yearlyService(oil_change));
		else if (choice == 3)
			System.out.println("Your cost is $" + yearlyService(oil_change, tire_rotation));
		else if (choice == 4)
			System.out.println("Your cost is $" + yearlyService(oil_change, tire_rotation, coupon));
		else if (choice == 5)
			break;

	}
		}
	
	// Method with no parameters
	public static int yearlyService() {
		return 400;
	}
	
	// Method with 1 parameter	
	public static int yearlyService(int p1) {
		return 400 + p1;
	}
	
	// Method with 2 parameters
	public static int yearlyService(int p1, int p2) {
		return 400 + p1 + p2;
	}
	
	// Method with 3 parameters
	public static int yearlyService(int p1, int p2, int p4) {
		return 400 + p1 + p2 - p4;
	}	

		
}


	
	
	
	
	 
		
		
