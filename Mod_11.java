// Andrew Schaefer
// 7/17/21
// Module 11 Assignment

// Imports the java.util package
import java.util.*;

public class Mod_11 {
	public static void main(String[] args) {
	

    // Declares new integer 2D array	
	int[][] int_arr = new int[3][3];
    int_arr[0][0] = 1; int_arr[0][1] = 2; int_arr[0][2] = 4;
    int_arr[1][0] = 8; int_arr[1][1] = 16; int_arr[1][2] = 32;
    int_arr[2][0] = 64; int_arr[2][1] = 128; int_arr[2][2] = 256;
	
	// Declares new double 2D array
	double[][] doub_arr = new double[2][2];
	doub_arr[0][0] = 1.1; doub_arr[0][1] = 2.2;
	doub_arr[1][0] = 3.3; doub_arr[1][1] = 4.4;
	
	// Displays the elements of int_arr
	for (int row = 0; row < int_arr.length; row++) {
		for (int column = 0; column < int_arr[row].length; column++) {
		System.out.print(int_arr[row][column] + " ");	
	} // End of 2nd for loop
	System.out.println();
	
}
    // Displays the elements of doub_arr
	for (int row = 0; row < doub_arr.length; row++) {
		for (int column = 0; column < doub_arr[row].length; column++) {
		System.out.print(doub_arr[row][column] + " ");	
	} // End of 2nd for loop
	System.out.println();
	
}

	// Get the location of the largest element
	int[] location = locateLargest(int_arr);
	int[] location2 = locateSmallest(int_arr);
	int[] location3 = locateLargest(doub_arr);
	int[] location4 = locateSmallest(doub_arr);

	
	
	// Display results
	System.out.println("The largest element in the integer 2D array is at (" +
		location[0] + ", " + location[1] + ")");
		
		// Displays results 
	System.out.println("The smallest element in the integer 2D array is at (" +
		location2[0] + ", " + location2[1] + ")");
	
	
	// Displays results 
	System.out.println("The largest element in the double 2D array is at (" +
		location3[0] + ", " + location3[1] + ")");
	
	
	// Displays results 
	System.out.println("The smallest element in the double 2D array is at (" +
		location4[0] + ", " + location4[1] + ")");

	
	}


    // Declares the locateLargest method that takes a 2D array of 
	// integers as a parameter
	public static int[] locateLargest(int[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					l[0] = i;
					l[1] = j;
					max = a[i][j];
				}
			}
		}
		return l;
	}


	// Declares the locateSmallest method that takes a 2D array of 
	// integers as a parameter
	public static int[] locateSmallest(int[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < max) {
					l[0] = i;
					l[1] = j;
					max = a[i][j];
				}
			}
		}
		return l;
	}
	
	
	// Declares the locateLargest method that takes a 2D array of 
	// doubles as a parameter
	public static int[] locateLargest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					l[0] = i;
					l[1] = j;
					max = a[i][j];
				}
			}
		}
		return l;
	}	
	
	
	// Declares the locateSmallest method that takes a 2D array of 
	// doubles as a parameter
	public static int[] locateSmallest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < max) {
					l[0] = i;
					l[1] = j;
					max = a[i][j];
				}
			}
		}
		return l;
	}
	
	
}

	
	
 




