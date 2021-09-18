
// Andrew Schaefer
// 5/25/21
// Mod 1 Assignment


public class Mod_1 {
    public static void main(String[] args) {
        System.out.println("This program's output demonstrates why decimal "
                + "points are important when dividing integers in Java.");
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 
                1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 
                + 1 / 13 ));
    }
    
}

// The difference between the outputs of the two above calculations exemplifies 
// why decimal points are needed when dividing integers in Java. When Java 
// divides integers, the result is truncated which means that the fractional 
// part of the result is discarded, and the result is rounded to the closest 
// integer. This is, of course, incorrect so we add decimal points to the 
// integers we will be dividing so Java knows to display a more accurate result 
// that includes floats.