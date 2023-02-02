package fa.training.excerises2;

public class Exercise_1 {
    public static void main(String[] args) {
        /*
        Exercise 1: Data type and Operators

        Specifications
        Write a Java program to find the value of specified expression.
         a) 101 + 0) / 3
         b) 3.0e-6 * 10000000.1
         c) true && true
         d) false && true
         e) (false && false) || (true && true)
         f) (false || false) && (true && true)
        */
        System.out.println("((101 + 0) /3) -> " + ((101 + 0) /3));
        System.out.println("(3.0e-6 * 10000000.1) -> " + (3.0e-6 * 10000000.1));
        System.out.println("(true && true) -> " + (true && true));
        System.out.println("(false && true) ->" + (false && true));
        System.out.println("(false && false) || (true && true) -> " + ((false && false) || (true && true)));
        System.out.println("(false || false) && (true && true) -> " + ((false || false) && (true && true)));
    }
}
