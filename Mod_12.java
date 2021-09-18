
// Andrew Schaefer
// 7/20/21
// Module 12 Assignment
// Redo of Module 6 


public class Mod_12 {
  public static void main(String[] args) {

    int number = 0; // Displayed number

    for (int row = 0; row <= 7; row++) {
      // Prints left spaces
      for (int col = 1; col <= 7 - row; col++){
        System.out.printf("%4s", " ");
      }

      // Prints the left side
      for (int col = 0; col <= row; col++){
        number = (int)Math.pow(2, col);
        System.out.printf("%4d", number);
      }

      // Prints the right side
      for (int col = row - 1; col >= 0; col--){
        number = (int)Math.pow(2, col);
        System.out.printf("%4d", number);
      }
      
      // Prints right spaces
      for (int col = 1; col <= 7 - row; col++){
        System.out.printf("%4s", " ");
      }

      // Prints "@" on a new line
      System.out.print("  @\n");
    }
  }
}