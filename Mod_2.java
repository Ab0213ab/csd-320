 
 
 // Andrew Schaefer
 // 5/25/21
 // Mod 2 Assignment

 // This simple program takes in user input to calculate the amount of energy in joules 
 // it will take to heat a certain mass of water from one temperature to another. 

 // Imports Scanner from the java.util package
import java.util.Scanner;

public class Mod_2 {
    public static void main(String[] args) {
		
		// Create a scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompts user for water mass and assigns it to the variable water_mass
        System.out.println("Enter the water mass in kilograms: ");
        double water_mass = input.nextDouble();
		
        // Prompts user for water initial temperature and assigns it to the 
		// variable initial_temp
        System.out.println("Enter the water initial temperature in Celsius: ");
        double initial_temp = input.nextDouble();
		
        // Prompts user for water final temperature and assigns it to the 
		// variable final_temp
        System.out.println("Enter the water final temperature in Celsius: ");
        double final_temp = input.nextDouble();
		
        // Calculates the amount of energy needed
        double calculation;
        calculation = water_mass * (final_temp - initial_temp) * 4184;
		
        // Displays the results in a formatted string
        System.out.println("It would take " + calculation + " Joules.");
    }
    
}