package Week1.Day3;

/**
 * Created by Justin on 7/13/16.
 */

public class Day3GreatestCommonDenominator2 {


    private static long[] longs = {500, 25000, 20, 100, 1000000, 800, 10};

    public static void main(String[] args) {
        long result = gcd(longs);
        System.out.println("Greatest common denominator is: " + result);
    }


    //GCD method
    private static long gcd(long[] input) {

        // loops through the long[]
        long result = input[0];
        for (int i = 0; i < input.length; i++) {
            // plugs values into the other gcd method
            result = Day3GreatestCommonDenominator.gcd(result, input[i]);
            // returns the greatest common denominator
        }
            return result;
        }


    }






