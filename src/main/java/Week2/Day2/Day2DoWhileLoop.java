package Week2.Day2;

/**
 * Created by Justin on 7/19/16.
 */
public class Day2DoWhileLoop {
    public static void main(String args[]) {
        whileLoop(5);
        System.out.println();
        doWhileLoop(6);
    }

    // create a new method called 'whileLoop' that takes an int called 'start'
    public static void whileLoop(int start) {
        // create a while loop that iterates from start to zero and prints out the resul
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
    }


    // create a new method called 'doWhileLoop' that takes an int called 'start'
    public static void doWhileLoop(int start) {
        do {
            System.out.println(start);
            start--;
        } while (start >= 0);
    }
    // create a do-while loop that iterates from start to zero and prints out the result

}
