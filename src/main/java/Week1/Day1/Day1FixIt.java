package Week1.Day1;

/**
 * Created by Justin on 7/11/16.
 */
public class Day1FixIt {
    private static int x = 12;
    private static int y = 28;
    private static double z = 3;

    public static void main(String[] args) {

        System.out.println ("the answer to ( x * y) / z" + calculate());


    }

    private static double calculate() {
        double d =(x * y) / z;
         return d;


    }
}

