
// Andrew Schaefer
// 7/7/21
// Module 9 Assignment

import java.util.Arrays;

public class Mod_9 {
	public static void main(String[] args) {
	
	// Creates new array named my_array
	int[] my_array = new int[20];
	
	// Imports java.util Scanner tools and creates Scanner object
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	// Prompts user for integers to use in array
	System.out.print("Enter " + my_array.length + " values: ");
	
	// Adds user input to array
	for (int x = 0; x < my_array.length; x++)
		my_array[x] = input.nextInt();

	
	// Finds and displays the array element with the highest value
	int max = my_array[0];
	for (int x =1; x < my_array.length; x++) {
		if (my_array[x] > max) max = my_array[x];
	}
	System.out.println("\nThe highest value entered is " + max + ".");
	
	// Sorts the array to finds and display the array element with the lowest value
	int min = my_array.length;
	Arrays.sort(my_array);
	int small = my_array[0];
	System.out.println("\nThe lowest value entered is " + small + ".");
	
	// Finds and displays the average of all array elements
	int total2 = 0;
	for (int x = 0; x < my_array.length; x++) {
		total2 += my_array[x];
	}	
	System.out.println("\nThe average of all the values entered is " + 
	total2 / my_array.length + ".");
	
	// Finds and displays the sum of all array elements
	int total = 0;
	for (int x = 0; x < my_array.length; x++) {
		total += my_array[x];
	}	
	System.out.println("\nThe sum of all values entered is " + total + ".");
	
	}
}

