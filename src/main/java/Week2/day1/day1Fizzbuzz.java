package Week2.day1;

/**
 * Created by Justin on 7/18/16.
 */
public class day1Fizzbuzz {

    public static void main(String[] args) {
        thisWay();
        thatway();
    }


    public static void thisWay() {
        // count from 1 to 100 (loop?)
        for (int i = 1; i <= 100; i++) {
            String returnThis = "";
            // check if divisible by 3 -- print Fizz
            if (i % 3 == 0) {
                returnThis += "fizz";
            }
            // check if divisible by 5 -- print Buzz
            else if (i % 5 == 0) {
                returnThis += "buzz";
            } //else if ((i % 3 == 0) && (i % 5 == 0)) {
            //   returnThis = "fizzbuzz";
            //}

            if (returnThis.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(returnThis);
            }
        }

    }

    public static void thatway() {
        // count from 1 to 100 (loop?)
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}


// if we have a word, print it, else print the number




