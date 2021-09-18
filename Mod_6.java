

// Andrew Schaefer
// 6/17/21
// Module 6 Assignment

 public class Mod_6 {
	 public static void main(String[] args) {
		
		int x = 7;
		int rowCount = 1;
		
		for (int i = x; i > 0; i--) {
			for (int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			
			}
			
			for (int j = 0; j <= rowCount-1; j++) {
				System.out.printf("%2d", (int)Math.pow(2, j));
			}
			
			for (int j = rowCount-1; j >= 1; j--) {
				System.out.printf("%2d", (int)Math.pow(2, j-1));
			}
			System.out.println();
			
			rowCount++;
		}
		
		
	 }
 }

 