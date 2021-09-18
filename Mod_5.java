

// Andrew Schaefer
// 6/12/21
// Module 5 Assignment


import java.util.ArrayList;

public class Mod_5 {
	public static void main(String[] args) {
		
		
		// Initialize variables
		 double num1 = 1;
		 double num2 = 3;
		 double sum = 0;
		 
		//  A new array list is created
		ArrayList<Double> myCalc = new ArrayList<Double>(); 

		 // While loop is started if num2 is less than 99
		 while (num2 <= 99) {
			 
			 //Divides 1 by num2
			  double answer = num1 / num2;
			 
			 // Adds the result to the array list
			  myCalc.add(answer);
			 
			 // Twice increments num2, which is the denominator
			  ++num2;
			  ++num2;
			  
			}
			
			// For loop iterates through each element in the array list
			for (Double result : myCalc) {
				  
			// Sums all the elements in the array list
			sum =+ sum + result;
			  			  	  		  
		 }
	 		 		 
		// Displays the equation and results
		System.out.println("The answer to 1/3 + 1/5 + 1/7 + 1/9 + 1/11 " + 
		"1/13 + 1/15 + 1/17 + 1/19 + 1/21 + 1/23 + 1/25 + 1/27 + 1/29 + 1/31 " + 
		"1/33 + 1/35 + 1/37 + 1/39 + 1/41 + 1/43 + 1/45 + 1/47 + 1/49 + 1/51 " + 
		"1/53 + 1/55 + 1/57 + 1/59 + 1/61 + 1/63 + 1/65 + 1/67 + 1/69 + 1/71 " + 
		"1/73 + 1/75 + 1/77 + 1/79 + 1/81 + 1/83 + 1/85 + 1/87 + 1/89 + 1/91 " + 
		"1/93 + 1955 + 1/97 + 1/99 is :" + sum);
		
		// Prints a blank line to make the two outputs look nice
		System.out.println();
		
			
// REVERSED ORDER:

		
		// Initialize variables
		double num3 = 1;
		double num4 = 99;
		double sum1 = 0;
		 
		//  A new array list is created
		ArrayList<Double> myCalc1 = new ArrayList<Double>(); 

		 // While loop is started if num4 is greater than 3
		 while (num4 >= 3) {
			 
			 //Divides 1 by num4
			  double answer = num3 / num4;
			 
			 // Adds the result to the array list
			  myCalc1.add(answer);
			 
			 // Twice increments num2, which is the denominator
			  --num4;
			  --num4;
			  
			}
			
			// For loop iterates through each element in the array list
			for (Double result1 : myCalc1) {
				  
			// Sums all the elements in the array list
			sum1 =+ sum1 + result1;
			  	  	  		  
		 }
		 		 
		// Displays the equation and results
		System.out.println("The answer to 1/99 + 1/97 + 1/95 + 1/91 + 1/89 " + 
		"1/87 + 1/85 + 1/83 + 1/81 + 1/79 + 1/77 + 1/75 + 1/73 + 1/71 + 1/69 " + 
		"1/67 + 1/65 + 1/63 + 1/59 + 1/57 + 1/55 + 1/53 + 1/51 + 1/49 + 1/47 " + 
		"1/45 + 1/43 + 1/41 + 1/39 + 1/37 + 1/35 + 1/33 + 1/29 + 1/27 + 1/25 " + 
		"1/23 + 1/21 + 1/19 + 1/17 + 1/15 + 1/13 + 1/11 + 1/9 + 1/7 + 1/5 " + 
		"1/3 is : " + sum1);
			
	}
}