package Week2.Day2;

/**
 * Created by Justin on 7/19/16.
 */
public class Day2FixNSwitchStatement {
    private static char branch = 'M'; // C - CSE, E - ECE, M - Mech
    private static int year = 1;

    public static void main(String[] args) {
        switch_it();
    }


    public static void switch_it() {
        switch (year) {

            case 1:
                System.out.println("English, Math, Drawing");
                break;
            case 2:
                switch (branch) { // LINE C
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                    default:
                        year = 0;

                        break;
                }
            case 3:
                switch (branch) {// LINE D

                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                    default:
                        year = 0;
                        break;

                }
        }

    }
}

   /* private static char branch = 'E'; // C - CSE, E - ECE, M - Mech
    private static String year = 2

    public static void Main(String[] args)
    switchit();
}

    private static void switchit() {
        switch( year )
        {
            case 1:
                System.out.println("English, Math, Drawing");
                break;
            case 2:
                switch( branch ) // LINE C
                {
                    case 'C:
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory")
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3
                switch( branch ) // LINE D
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'ZZZ':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;

        }
*/
