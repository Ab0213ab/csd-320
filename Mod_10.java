
// Andrew Schaefer
// 7/8/21
// Module 10 Assignment

import java.util. *;

public class Mod_10 {
	public static void main(String[] args) {
		
	// Array initializers
	short[] short_array = {14555, 25322, 21990, 19420, 30307};
	int[] int_array = {143652, 156308, 169381};
	long[] long_array = {253, 263, 373, 283};
	double[] double_array = {1.4, 7.7, 4.4, 8.9, 2.6, 9.3};
		
	
    // Iterates through the int array and displays the array elements
	System.out.print("The elements in int_array are: ");
	for (int e: int_array) {
		System.out.print(e + ", ");
	} 
	// Calls average method
	System.out.println("\nThe average of the elements in int_array is: " + average(int_array));
	
	
	// Iterates through the short array and displays the array elements
	System.out.print("The elements in short_array are: ");
	for (int e: short_array) {
		System.out.print(e + ", ");
	}
	// Calls average method
	System.out.println("\nThe average of the elements in short_array is: " + average(short_array));
	
	
	// Iterates through the double array and displays the array elements
	System.out.print("The elements in double_array are: ");
	for (double e: double_array) {
		System.out.print(e + ", ");
	} 
	// Calls average method
    System.out.println("\nThe average of the elements in double_array is:  " + average(double_array));
	
	
	// Iterates through the short array and displays the array elements
	System.out.print("The elements in long_array are: ");
	for (long e: long_array) {
		System.out.print(e + ", ");
	}
	// Calls average method
    System.out.println("\nThe average of the elements in long_array is:  " + average(long_array));	
			
	} 
	
	
	// Declares average method
    public static int average(int[] int_array) {
		int sum = 0;
		int average;
		
		for (int i = 0; i < int_array.length; i++) {
			sum = sum + int_array[i];
		}
		average = (int)sum / int_array.length;
		return average;
	
	} 

    // Declares average method
    public static long average(long[] long_array) {
		long sum = 0;
		long average;
		
		for (int i = 0; i < long_array.length; i++) {
			sum = sum + long_array[i];
		}
		average = (int)sum / long_array.length;
		return average;
	
	} 

    // Declares average method
    public static double average(double[] double_array) {
		double sum = 0;
		double average;
		
		for (int i = 0; i < double_array.length; i++) {
			sum = sum + double_array[i];
		}
		average = (int)sum / double_array.length;
		return average;
	
	} 

    
	// Declares average method
	public static short average(short[] short_array) {
		int sum = 0;
		int average;
		
		for (int i = 0; i < short_array.length; i++) {
			sum = sum + short_array[i];
		}
		average = (short)sum / short_array.length;
		return (short) average;
	
	} 		
}
