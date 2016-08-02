package Week1.Day3;

/**
 * Created by Justin on 7/13/16.
 */
/*public class Day3GreatestCommonDenominator {


    private int tmpA = 2500;
    private String tmpB = "500";

    public static void main(String[] args) {
        long result = lcd(tmpA, tmpB);
        System.out.print(RESULT:result)


        public static long gcd ( long a, long b){
            while (b > 0) {
                long temp = b;
                b = a % b; // % is remainder
                a = temp;
            }
            return a;
        }

    }
}*/
public class Day3GreatestCommonDenominator {


    private static long tmpA = 25;
    private static long tmpB = 50;


    public static void main(String[] args) {
            long result = gcd(tmpA, tmpB);
            System.out.println("result " + result);
        }


        public static Long gcd ( long a, long b){
            while (b > 0) {
                Long temp = b;
                b = a % b; // % is remainder
                a = temp;

            }
            return a;
        }

    }

